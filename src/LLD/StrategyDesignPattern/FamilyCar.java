package LLD.StrategyDesignPattern;

import LLD.StrategyDesignPattern.Drive.*;

public class FamilyCar extends Vehicle{
    public FamilyCar() {
        super(new NormalDrive());
    }
}
