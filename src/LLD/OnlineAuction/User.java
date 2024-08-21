package LLD.OnlineAuction;

import java.security.*;
import java.util.*;

public class User {
    private String userId;
    private String userName;
    Auctioneer auctioneer;
    Map<String, List<Bid>> biddingHistory;
    public User(String userId, String userName, Auctioneer auctioneer) {
        this.userId = userId;
        this.userName = userName;
        biddingHistory = new HashMap<>();
        this.auctioneer = auctioneer;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public Auction createAuction(double startingPrice, String auctionId) {
        Auction auction = new Auction();
        auction.setStartingPrice(startingPrice);
        auction.setCreatedBy(this);
        auction.setId(auctionId);
        auction.setStatus(AuctionStatus.IDLE);
        auction.setCurrentPrice(startingPrice);
        auction.setFinalPrice(0);
        auction.setName("Car Auction");
        auctioneer.addAuction(auction);
        return auction;
    }
    public void bid(double amount, String auctionId) {
        Auction currentAuction = auctioneer.getAuctionById(auctionId);
        if (currentAuction.getCreatedBy().getUserId().equalsIgnoreCase(this.userId)) {
            System.out.println("You are the creator of this auction you, cannot bid");
            return;
        }
        Bid bidder = new Bid();
        bidder.setBidUser(this);
        bidder.setBidAmount(amount);
        bidder.setAuctionId(auctionId);
        if (currentAuction.getStatus().equals(AuctionStatus.IN_PROGRESS)
                || currentAuction.getStatus().equals(AuctionStatus.IDLE))
            auctioneer.increaseBidAndNotify(bidder);

    }
    public void receiveNotification(double amount) {
        System.out.println("Bidder " + userName + " got notification of amount increase by : " + amount);
    }
    public void auctionEndNotification(String auctionName, String winnerName) {
        System.out.println(auctionName + " has ended." + " The winner is " + winnerName);
    }
    public String generateAuctionId() {
        StringBuilder sb = new StringBuilder();
        Random random = new SecureRandom();
        for (int i = 0; i < 4; i ++) {
            sb.append(random.nextInt());
        }
        return sb.toString();
    }
}
