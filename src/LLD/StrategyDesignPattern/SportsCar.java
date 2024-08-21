package LLD.StrategyDesignPattern;

import LLD.StrategyDesignPattern.Drive.*;

public class SportsCar extends Vehicle{
    public SportsCar() {
        super(new FancyDrive());
    }

}
