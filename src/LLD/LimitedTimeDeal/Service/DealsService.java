package LLD.LimitedTimeDeal.Service;

import LLD.LimitedTimeDeal.Entities.*;

import java.sql.*;
import java.time.*;

public interface DealsService {
    void createDeal(Deal deal);
    void updateDealEndTime(int dealId, LocalDateTime endTime);
    void updateDealItems(int dealId, int noOfItems);
    void claimDeal(int dealId, User claimedUser);
    void endDeal(int dealId);
}
