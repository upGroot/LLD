package LLD.ParkingSpotLLD;

import LLD.ParkingSpotLLD.ParkingSpot.*;
import LLD.ParkingSpotLLD.Vehicle.*;

public class Ticket {
    private int id;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    String entryTime;

    public Ticket(int id, Vehicle vehicle, ParkingSpot parkingSpot, String entryTime) {
        this.id = id;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
    }

    public int getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public String getEntryTime() {
        return entryTime;
    }
}
