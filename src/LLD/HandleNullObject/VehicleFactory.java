package LLD.HandleNullObject;
public class VehicleFactory {
    static Vehicle getVehicleObject(String vehicleType) {
        if("CAR".equalsIgnoreCase(vehicleType))
            return new Car();
        return new Null();
    }
}
