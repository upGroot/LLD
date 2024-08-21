package LLD.CarRentalDesign.Shop;

import LLD.CarRentalDesign.*;
import LLD.CarRentalDesign.Reservation.*;
import LLD.CarRentalDesign.User.*;
import LLD.CarRentalDesign.Vehicle.*;

import java.util.*;

public class Shop {
    Location location;
    private int id;
    List<Reservation> reservationList;
    VehicleInventoryManager vehicleInventoryManager;


    // Can also add or remove vehicle, will call vehicleInventoryManager methods for that....


    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        return vehicleInventoryManager.getVehicleList();
    }
    public Reservation makeReservation(Vehicle vehicle, User user) {
        Reservation reservation = new Reservation();
        reservation.makeReservation(vehicle, user);
        reservationList.add(reservation);
        return reservation;
    }
    public boolean completeReservation(int reservationId) {
        // find the reservation by id...
        return true;
    }
}
