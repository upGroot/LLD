package LLD.ParkingSpotLLD.Entry;

import LLD.ParkingSpotLLD.*;
import LLD.ParkingSpotLLD.ParkingSpot.*;
import LLD.ParkingSpotLLD.Vehicle.*;

import java.util.*;

public class EntryGate {
    public static EntryGate instance;
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    public EntryGate() {
        this.parkingSpotManagerFactory = new ParkingSpotManagerFactory();
    }
    public static synchronized EntryGate getInstance() {
        if(instance == null) {
            instance = new EntryGate();
        }
        return instance;
    }
    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType, List<ParkingSpot> parkingSpots) {
        return parkingSpotManagerFactory.getParkingSpotManager(vehicleType, parkingSpots);
    }
    public Ticket generateTicket(ParkingSpot parkingSpot, Vehicle vehicle) {
        return null;
    }
}
