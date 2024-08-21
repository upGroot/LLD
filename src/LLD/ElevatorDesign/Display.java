package LLD.ElevatorDesign;

public class Display {
    Direction direction;
    int floor;

    public Display(Direction direction, int floor) {
        this.direction = direction;
        this.floor = floor;
    }

    public void showDisplay() {
        System.out.println(direction);
        System.out.println(floor);
    }
}
