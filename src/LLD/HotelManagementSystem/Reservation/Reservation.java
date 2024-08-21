package LLD.HotelManagementSystem.Reservation;

import LLD.HotelManagementSystem.*;
import LLD.HotelManagementSystem.Room.*;
import lombok.*;

@Setter
@Getter
public class Reservation {
    private int id;
    private Guest bookedUser;
    private Room bookedRoom;
    private ReservationStatus status;

    public Reservation(int id, Guest bookedUser, Room bookedRoom, ReservationStatus status) {
        this.id = id;
        this.bookedUser = bookedUser;
        this.bookedRoom = bookedRoom;
        this.status = status;
    }
}
