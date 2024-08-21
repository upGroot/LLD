package LLD.BookMyShow;

public class Seat {
    private int id;
    private int rowNumber;
    private SeatCategory seatCategory;

    public Seat(int id, int rowNumber, SeatCategory seatCategory) {
        this.id = id;
        this.rowNumber = rowNumber;
        this.seatCategory = seatCategory;
    }
}
