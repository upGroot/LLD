package LLD.ParkingSpotLLD.ParkingSpot;

public class ParkingSpot {
    private int id;
    boolean isEmpty;
    public ParkingSpot(int id) {
        this.id = id;
        isEmpty = true;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
