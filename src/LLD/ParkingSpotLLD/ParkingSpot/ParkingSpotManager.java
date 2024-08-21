package LLD.ParkingSpotLLD.ParkingSpot;

import LLD.ParkingSpotLLD.Vehicle.*;

import java.util.*;

public abstract class ParkingSpotManager {
    List<ParkingSpot> parkingSpots;
    public ParkingSpotManager(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
    public abstract ParkingSpot getParkingSpot();
    public void addVehicleToParkingSpot(ParkingSpot parkingSpot) {
        parkingSpot.setEmpty(false);
    }
    public void removeVehicleFromParkingSpot(ParkingSpot parkingSpot) {
        parkingSpot.setEmpty(true);
    }
    public void addNewParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
    }
}
