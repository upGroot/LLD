package LLD.StrategyDesignPattern.Drive;

public class NormalDrive implements DriveType{
    @Override
    public void drive() {
        System.out.println("Amazing! You chose normal car drive");
    }
}
