package LLD.ParkingSpotLLD.ParkingSpot;

import LLD.ParkingSpotLLD.Vehicle.*;

import java.util.*;

public class ParkingSpotManagerFactory {
    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType, List<ParkingSpot> parkingSpots) {
        if (vehicleType.equals("TWO_WHEELER"))
            return new TwoWheelerParkingSpot(parkingSpots);
        else if (vehicleType.equals("FOUR_WHEELER"))
            return new FourWheelerParkingSpot(parkingSpots);
        return null;
    }
}
