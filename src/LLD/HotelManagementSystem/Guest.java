package LLD.HotelManagementSystem;

import lombok.*;

@Setter
@Getter
public class Guest {
    private int id;
    private String name;
    private String address;
    private String phone;

    public Guest(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}
