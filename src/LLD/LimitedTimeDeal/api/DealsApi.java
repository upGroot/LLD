package LLD.LimitedTimeDeal.api;

import LLD.LimitedTimeDeal.Entities.*;

import java.sql.*;
import java.time.*;

public interface DealsApi {

    //PostMapping
    void createDeal(Deal deal);
    //PutMapping
    void updateDeal(int dealId, int noOfItems, LocalDateTime endTime);
    //PutMapping
    void endDeal(int dealId);
    //PostMapping
    void claimDeal(int dealId, User user);
}
