package LLD.LimitedTimeDeal.Entities;

import lombok.*;
import java.time.*;
import java.util.*;

@Getter
@Setter
public class Deal {
    private int id;
    private String name;
    private int itemId;
    private LocalDateTime endTime;
    private double price;
    private int noOfItems;
    private DealStatus dealStatus;
    List<Integer> claimedUser;

    public Deal(int id, String name, int itemId, LocalDateTime endTime, double price, int noOfItems) {
        this.id = id;
        this.name = name;
        this.itemId = itemId;
        this.endTime = endTime;
        this.price = price;
        this.noOfItems = noOfItems;
        claimedUser = new ArrayList<>();
        dealStatus = DealStatus.ACTIVE;
    }
}
