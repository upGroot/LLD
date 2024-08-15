package LLD.LimitedTimeDeal.Service.impl;

import LLD.LimitedTimeDeal.Entities.*;
import LLD.LimitedTimeDeal.Exception.*;
import LLD.LimitedTimeDeal.Service.*;

import java.sql.*;
import java.time.*;
import java.util.*;

public class DealsServiceImpl implements DealsService {
    public static DealsServiceImpl instance;
    List<Deal> dealsList;
    private DealsServiceImpl() {
        dealsList = new ArrayList<>();
    }
    public static DealsServiceImpl getInstance() {
        if (instance == null) {
            synchronized (DealsServiceImpl.class) {
                if (instance == null)
                    instance = new DealsServiceImpl();
            }
        }
        return instance;
    }
    public void createDeal(Deal deal) {
        dealsList.add(deal);
    }
    private Deal getDealById(int dealId) throws DealNotFoundException {
        Deal deal = fetchDealFromDataSource(dealId);
        if (deal == null) {
            throw new DealNotFoundException("No deal present with the given ID: " + dealId);
        }
        return deal;
    }
    private Deal fetchDealFromDataSource(int dealId) {
        for (Deal deal : dealsList) {
            if (deal.getId() == dealId) return deal;
        }
        return null;
    }
    public void updateDealEndTime(int dealId, LocalDateTime endTime) {
        try{
            Deal deal = getDealById(dealId);
            deal.setEndTime(endTime);
        } catch (RuntimeException e) {
            throw new RuntimeException("No deal present with given id");
        }
    }
    public void updateDealItems(int dealId, int noOfItems) {
        try{
            Deal deal = getDealById(dealId);
            deal.setNoOfItems(noOfItems);
        } catch (RuntimeException e) {
            throw new RuntimeException("No deal present with given id");
        }
    }
    public void claimDeal(int dealId, User claimedUser) {
        try {
            Deal deal = getDealById(dealId);
            validateDeal(deal, claimedUser);
            processDealClaim(deal, claimedUser);
        } catch (DealNotFoundException | DealClaimException | DealExpiredException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private void validateDeal(Deal deal, User claimedUser) {
        if (!deal.getDealStatus().equals(DealStatus.ACTIVE)) {
            throw new DealClaimException("The deal is not active.");
        }

        if (hasDealExpired(deal)) {
            throw new DealExpiredException("The deal has ended.");
        }

        if (maximumLimitReached(deal)) {
            throw new DealClaimException("Maximum limit for this deal has been reached.");
        }

        if (checkIfUserAlreadyClaimed(claimedUser, deal)) {
            throw new DealClaimException("You have already claimed this deal.");
        }
    }

    private boolean hasDealExpired(Deal deal) {
        LocalDateTime currentTime = LocalDateTime.now();
        return !currentTime.isBefore(deal.getEndTime());
    }

    private void processDealClaim(Deal deal, User claimedUser) {
        deal.setNoOfItems(deal.getNoOfItems() - 1);
        deal.getClaimedUser().add(claimedUser.getUserId());
        System.out.println("Deal claimed successfully");
    }

    private boolean checkIfUserAlreadyClaimed(User claimedUser, Deal deal) {
        return deal.getClaimedUser().contains(claimedUser.getUserId());
    }

    private boolean maximumLimitReached(Deal deal) {
        return deal.getClaimedUser().size() >= deal.getNoOfItems();
    }
    public void endDeal(int dealId) {
        try{
            Deal deal = getDealById(dealId);
            deal.setDealStatus(DealStatus.INACTIVE);
        } catch (RuntimeException e) {
            throw new RuntimeException("No deal present with given id");
        }
    }
}
