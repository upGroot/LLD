package LLD.ParkingLot.Exit;

import LLD.ParkingLot.ParkingSpot.*;
import LLD.ParkingLot.TicketCounter.*;
import java.util.*;

public class ExitGate {
    Ticket ticket;
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    public ExitGate(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }
    public void exitVehicle(Ticket ticket) {
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManger(ticket.getVehicle().getVehicleType(), new ArrayList<>());
        parkingSpotManager.removeVehicle(ticket.getVehicle());
    }
}
