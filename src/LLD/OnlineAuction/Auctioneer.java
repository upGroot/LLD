package LLD.OnlineAuction;

import java.util.*;

public class Auctioneer {
    Map<String, List<User>> auctionIdToUserParticipating;
    List<Auction> allAuctions;
    private static Auctioneer instance;
    public Auctioneer() {
        auctionIdToUserParticipating = new HashMap<>();
        allAuctions = new ArrayList<>();
    }

    public static synchronized Auctioneer getInstance() {
        if (instance == null) {
            instance = new Auctioneer();
        }
        return instance;
    }
    public void addUserToAuction(User user, String auctionId) {
        if (!auctionIdToUserParticipating.containsKey(auctionId))
            auctionIdToUserParticipating.put(auctionId, new ArrayList<>());
        List<User> biddingUsers = auctionIdToUserParticipating.get(auctionId);
        biddingUsers.add(user);
        auctionIdToUserParticipating.put(auctionId, biddingUsers);

    }
    public Auction getAuctionById(String id) {
        for (Auction auction : allAuctions) {
            if (auction.getId().equalsIgnoreCase(id)) return auction;
        }
        return null;
    }
    public void addAuction(Auction auction) {
        allAuctions.add(auction);
    }
    public List<User> getAllUserFromAuction(String id) {
        return auctionIdToUserParticipating.get(id);
    }
    public synchronized void increaseBidAndNotify(Bid bidder) {
        List<User> usersBidding = auctionIdToUserParticipating.get(bidder.getAuctionId());
        Auction currentAuction = getAuctionById(bidder.getAuctionId());
        User bidUser = bidder.getBidUser();
        if (usersBidding == null || !usersBidding.contains(bidUser)) addUserToAuction(bidUser, bidder.getAuctionId());
        if (currentAuction.getCurrentPrice() > bidder.getBidAmount()) {
            System.out.println("You cannot bid lower than current amount : " + currentAuction.getCurrentPrice());
            return;
        }
        currentAuction.setCurrentPrice(bidder.getBidAmount());
        for (User user : usersBidding) {
            if (!user.getUserId().equalsIgnoreCase(bidUser.getUserId())) user.receiveNotification(bidder.getBidAmount());
        }
        if(currentAuction.getCurrentPrice() > 5000) {
            currentAuction.setFinalPrice(currentAuction.getCurrentPrice());
            endAuction(currentAuction, bidUser);
            notifyBiddersAboutAuctionEnd(usersBidding, currentAuction.getName(), currentAuction.getWinner().getUserName());
        }
    }
    public synchronized void endAuction(Auction auction, User winnerUser) {
        auction.setWinner(winnerUser);
        auction.setStatus(AuctionStatus.COMPLETED);
    }
    public void notifyBiddersAboutAuctionEnd(List<User> bidUsers, String auctionName, String winnerName) {
        for (User user : bidUsers) {
            user.auctionEndNotification(auctionName, winnerName);
        }
    }
}
