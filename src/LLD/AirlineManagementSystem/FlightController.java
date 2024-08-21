package LLD.AirlineManagementSystem;

import java.util.*;

public class FlightController {
    List<Flight> flightList;

    public FlightController() {
        flightList = new ArrayList<>();
    }
    public void addFlight(Flight flight) {
        flightList.add(flight);
    }
    public void removeFlightById(String id) {

    }
    public List<Flight> getAllFlight() {
        return flightList;
    }
    public List<Flight> getAllFlightsByLocation(String source, String destination) {
        return null;
    }
}
