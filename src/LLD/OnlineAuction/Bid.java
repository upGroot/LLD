package LLD.OnlineAuction;

import lombok.*;

public class Bid {
    private int bidId;
    private double bidAmount;
    private User bidUser;
    private String auctionId;
    public int getBidId() {
        return bidId;
    }

    public void setBidId(int bidId) {
        this.bidId = bidId;
    }

    public double getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(double bidAmount) {
        this.bidAmount = bidAmount;
    }

    public User getBidUser() {
        return bidUser;
    }

    public void setBidUser(User bidUser) {
        this.bidUser = bidUser;
    }

    public String getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(String auctionId) {
        this.auctionId = auctionId;
    }
}
