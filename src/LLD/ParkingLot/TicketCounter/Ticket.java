package LLD.ParkingLot.TicketCounter;

import LLD.ParkingLot.ParkingSpot.*;
import LLD.ParkingLot.Vehicle.*;

public class Ticket {
    private int id;
    private String currentTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
