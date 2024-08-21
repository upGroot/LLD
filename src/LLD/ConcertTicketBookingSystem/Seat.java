package LLD.ConcertTicketBookingSystem;

public class Seat {
    SeatType seatType;
    private String seatNumber;
    SeatStatus seatStatus;
    double price;
    public Seat(SeatType seatType, String seatNumber, SeatStatus seatStatus, double price) {
        this.seatStatus = seatStatus;
        this.seatType = seatType;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }
    public void release() {
        this.seatStatus = SeatStatus.NOT_BOOKED;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
