package LLD.HotelManagementSystem;

import LLD.HotelManagementSystem.Reservation.*;
import LLD.HotelManagementSystem.Room.*;

import java.util.*;

public class HotelManagementSystem {
    ReservationManager reservationManager;
    RoomManager roomManager;
    private static HotelManagementSystem instance;
    private HotelManagementSystem() {
        reservationManager = ReservationManager.getInstance();
        roomManager = RoomManager.getInstance();
    }
    public static HotelManagementSystem getInstance() {
        if (instance == null) {
            synchronized (HotelManagementSystem.class) {
                if (instance == null) instance = new HotelManagementSystem();
            }
        }
        return instance;
    }
    public void demo(Guest guest) {
        System.out.println("All available rooms : ");
        List<Room> availableRooms = roomManager.getAllAvailableRoom();
        Room selectedRoom = availableRooms.get(0);
        book(guest, selectedRoom);
    }
    public void book(Guest bookedGuest, Room selectedRoom) {
        Reservation reservation = reservationManager.makeReservation(bookedGuest, selectedRoom);
        if (processPayment(bookedGuest)) {
            reservation.setStatus(ReservationStatus.RESERVED);
            selectedRoom.setRoomStatus(RoomStatus.BOOKED);
        }
        else reservation.setStatus(ReservationStatus.CANCELLED);
    }
    public boolean processPayment(Guest guest) {
        return true;
    }
}
