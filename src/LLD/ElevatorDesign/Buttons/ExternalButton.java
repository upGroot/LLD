package LLD.ElevatorDesign.Buttons;

import LLD.ElevatorDesign.*;

public class ExternalButton {
    ExternalButtonDispatcher externalButtonDispatcher;
    public void pressButton(int floor, Direction direction) {
        externalButtonDispatcher.submitRequest(floor, direction);
    }
}
