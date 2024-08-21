package LLD.ParkingLot.ParkingSpot;

import java.util.*;

public class TwoWheelerParkingSpot extends ParkingSpotManager{
    public TwoWheelerParkingSpot(List<ParkingSpot> parkingSpots) {
        super(parkingSpots);
    }

    @Override
    public ParkingSpot findParkingSpace() {
        return null;
    }
}
