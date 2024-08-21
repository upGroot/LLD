package LLD.ParkingLot.ParkingSpot;

import LLD.ParkingLot.Vehicle.*;

import java.util.*;

public class ParkingSpotManagerFactory {
    public ParkingSpotManager getParkingSpotManger(VehicleType vehicleType, List<ParkingSpot> parkingSpots) {
        if (vehicleType.equals("TWO_WHEELER"))
                return new TwoWheelerParkingSpot(parkingSpots);
        else if (vehicleType.equals("FOUR_WHEELER"))
                return new FourWheelerParkingSpot(parkingSpots);
        else return null;
    }
}
