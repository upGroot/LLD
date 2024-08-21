package LLD.ParkingLot.ParkingSpot;

import LLD.ParkingLot.Vehicle.*;

public class ParkingSpot {
    private int id;
    private Vehicle vehicle;
    private double price;
    private boolean isEmpty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ParkingSpot(int id, double price) {
        this.id = id;
        this.price = price;
        this.isEmpty = true;
    }
    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isEmpty = false;
    }
    public void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }
}
