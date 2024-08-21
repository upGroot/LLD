package LLD.StrategyDesignPattern.Drive;

public class FancyDrive implements DriveType{

    @Override
    public void drive() {
        System.out.println("Amazing! You chose fancy car....");
    }
}
