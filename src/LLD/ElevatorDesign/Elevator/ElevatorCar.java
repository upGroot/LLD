package LLD.ElevatorDesign.Elevator;

import LLD.ElevatorDesign.*;
import LLD.ElevatorDesign.Buttons.*;

public class ElevatorCar {
    int id;
    InternalButton internalButton;
    ElevatorState elevatorState;
    Display display;
    int currentFloor;
    ElevatorDoor elevatorDoor;
    Direction direction;

    public ElevatorCar() {
        display = new Display(Direction.UP, 0);
        internalButton = new InternalButton();
        elevatorState = ElevatorState.IDLE;
        currentFloor = 0;
        direction = Direction.UP;
        elevatorDoor = new ElevatorDoor();

    }

    public void moveElevator(Direction dir, int floor) {
        int startFloor = currentFloor;
        if(dir == direction.UP) {

        }
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public InternalButton getInternalButton() {
        return internalButton;
    }

    public void setInternalButton(InternalButton internalButton) {
        this.internalButton = internalButton;
    }

    public ElevatorState getElevatorState() {
        return elevatorState;
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public ElevatorDoor getElevatorDoor() {
        return elevatorDoor;
    }

    public void setElevatorDoor(ElevatorDoor elevatorDoor) {
        this.elevatorDoor = elevatorDoor;
    }
}

