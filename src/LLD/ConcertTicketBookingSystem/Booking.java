package LLD.ConcertTicketBookingSystem;

public class Booking {
    private String bookingId;
    User bookedUser;
    String concertId;
    String seatNumber;

    public Booking(String bookingId, User bookedUser, String concertId, String seatNumber) {
        this.bookedUser = bookedUser;
        this.bookingId = bookingId;
        this.concertId = concertId;
        this.seatNumber = seatNumber;
    }
    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public User getBookedUser() {
        return bookedUser;
    }

    public void setBookedUser(User bookedUser) {
        this.bookedUser = bookedUser;
    }

    public String getConcert() {
        return concertId;
    }

    public void setConcert(String concertId) {
        this.concertId = concertId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
}
