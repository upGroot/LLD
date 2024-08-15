package LLD.LimitedTimeDeal.Controller;

import LLD.LimitedTimeDeal.Entities.*;
import LLD.LimitedTimeDeal.Service.*;
import LLD.LimitedTimeDeal.Service.impl.*;
import LLD.LimitedTimeDeal.api.*;

import java.sql.*;
import java.time.*;

public class DealsController implements DealsApi {
    private final DealsService dealsService;

    public DealsController() {
        this.dealsService = DealsServiceImpl.getInstance();
    }

    @Override
    public void createDeal(Deal deal) {
        try {
            dealsService.createDeal(deal);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateDeal(int dealId, int noOfItems, LocalDateTime endTime) {
        try {
            if (endTime == null)
                dealsService.updateDealItems(dealId, noOfItems);
            else
                dealsService.updateDealEndTime(dealId, endTime);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void endDeal(int dealId) {
        try{
            dealsService.endDeal(dealId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public synchronized void claimDeal(int dealId, User user) {
        try{
            dealsService.claimDeal(dealId, user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
