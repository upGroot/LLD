package LLD.OnlineAuction;

public class Main {
    public static void main(String[] args){
        Auctioneer auctioneer = new Auctioneer();
        User user1 = new User("1001", "Ayush", auctioneer);
        User user2 = new User("1002", "Aman", auctioneer);
        User user3 = new User("1003", "Amit", auctioneer);
        User user4 = new User("1004", "Shikha", auctioneer);
        User user5 = new User("1005", "Sanjay", auctioneer);
        User user6 = new User("1006", "Meenu", auctioneer);
        Auction auction1 = user1.createAuction(700, "A23");
        Auction auction2 = user2.createAuction(1000, "B23");
        auctioneer.addUserToAuction(user1, auction1.getId());
        auctioneer.addUserToAuction(user2, auction1.getId());
        auctioneer.addUserToAuction(user3, auction1.getId());
        auctioneer.addUserToAuction(user4, auction1.getId());
        auctioneer.addUserToAuction(user5, auction1.getId());
        auctioneer.addUserToAuction(user6, auction1.getId());

        user2.bid(800, auction1.getId());
        user1.bid(900, auction1.getId());
        user4.bid(600, auction1.getId());
        user3.bid(5001, auction1.getId());
    }
}
