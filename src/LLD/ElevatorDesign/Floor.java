package LLD.ElevatorDesign;

import LLD.ElevatorDesign.Buttons.*;

public class Floor {
    private int floorNumber;
    ExternalButton externalButton;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public ExternalButton getExternalButton() {
        return externalButton;
    }

    public void setExternalButton(ExternalButton externalButton) {
        this.externalButton = externalButton;
    }
}
