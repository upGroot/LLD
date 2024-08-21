package LLD.HandleNullObject;

public class Main {

    public static void main(String[] args){
      //
        Vehicle vehicle = VehicleFactory.getVehicleObject("cr");
        System.out.println(vehicle.seatingCapacity());
        System.out.println(vehicle.tankCapacity());
    }
}
