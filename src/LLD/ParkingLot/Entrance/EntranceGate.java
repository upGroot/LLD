package LLD.ParkingLot.Entrance;

import LLD.ParkingLot.ParkingSpot.*;
import LLD.ParkingLot.TicketCounter.*;
import LLD.ParkingLot.Vehicle.*;

import java.util.*;

public class EntranceGate {
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    EntranceGate(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }
    ParkingSpot findParkingSpace(VehicleType vehicleType, List<ParkingSpot> parkingSpots) {
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManger(vehicleType, parkingSpots);
        return parkingSpotManager.findParkingSpace();
    }
    Ticket generateTicket() {
        return null;
    }

}
