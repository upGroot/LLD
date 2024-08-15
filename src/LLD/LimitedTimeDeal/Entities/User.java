package LLD.LimitedTimeDeal.Entities;


import lombok.*;

@Setter
@Getter
public class User {
    private int userId;
    private String userName;
    private String address;

    public User(int userId, String userName, String address) {
        this.userId = userId;
        this.userName = userName;
        this.address = address;
    }
}
