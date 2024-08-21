package LLD.StrategyDesignPattern;

import LLD.StrategyDesignPattern.Drive.*;

public class Vehicle {
    DriveType driveType;
    public Vehicle(DriveType driveType) {
        this.driveType = driveType;
    }
    public void drive() {
        driveType.drive();
    }
}
