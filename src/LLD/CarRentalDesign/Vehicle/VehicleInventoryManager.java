package LLD.CarRentalDesign.Vehicle;

import java.util.*;

public class VehicleInventoryManager {
    List<Vehicle> vehicleList;
    public VehicleInventoryManager(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
