package LLD.HotelManagementSystem.Room;

import lombok.*;

@Getter
@Setter
public class Room {
    private int id;
    private RoomType roomType;
    private RoomStatus roomStatus;
    private double roomPrice;

    public Room(int id, RoomType roomType, RoomStatus roomStatus, double roomPrice) {
        this.id = id;
        this.roomType = roomType;
        this.roomStatus = roomStatus;
        this.roomPrice = roomPrice;
    }
}
