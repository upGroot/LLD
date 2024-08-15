package LLD.LimitedTimeDeal.Entities;


import lombok.*;

@Getter
@Setter
public class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
