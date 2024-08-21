package LLD.ParkingLot.ParkingSpot;

import LLD.ParkingLot.Vehicle.*;

import java.util.*;

public abstract class ParkingSpotManager {
    List<ParkingSpot>  parkingSpots;
    public ParkingSpotManager(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
    public abstract ParkingSpot findParkingSpace();
    public void parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = findParkingSpace();
        spot.parkVehicle(vehicle);
    }
    public void removeVehicle(Vehicle vehicle) {
        for(ParkingSpot parkingSpot : parkingSpots) {
            if(parkingSpot.getVehicle().equals(vehicle)) {
                parkingSpot.removeVehicle();
                break;
            }

        }
    }
}
