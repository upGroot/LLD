package LLD.LimitedTimeDeal;

import LLD.LimitedTimeDeal.Controller.*;
import LLD.LimitedTimeDeal.Entities.*;
import LLD.LimitedTimeDeal.api.*;

import java.sql.*;
import java.time.*;
import java.time.temporal.*;

public class DealDemo {
    public static void main(String[] args){
        DealsApi apis = new DealsController();
        User user1 = new User(101, "ayush", "jamshedpur");
        User user2 = new User(102, "amit", "bangalore");
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime futureTime = currentTime.plusHours(2);
        Deal deal1 = new Deal(400, "HRX Shoes", 110, futureTime, 200.0, 1);
        Deal deal2 = new Deal(500, "FM", 120, futureTime, 400.0, 1);
        apis.createDeal(deal1);
        apis.createDeal(deal2);
        apis.claimDeal(400, user1);
//        apis.claimDeal(400, user2);
        apis.claimDeal(500, user2);
//        apis.claimDeal(500, user1);
        apis.claimDeal(100, user1);
    }
}
