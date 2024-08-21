package LLD.DoctorAppointmentBookingSystem;

public class Booking {
    private String bookingId;
    private Patient bookedBy;
    private Doctor bookedDoctor;
    private double price;
    private String time;
    public Booking(String bookingId, Patient bookedBy, Doctor bookedDoctor, double price, String time) {
        this.bookingId = bookingId;
        this.bookedBy = bookedBy;
        this.bookedDoctor = bookedDoctor;
        this.price = price;
        this.time = time;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Patient getBookedBy() {
        return bookedBy;
    }

    public Doctor getBookedDoctor() {
        return bookedDoctor;
    }

    public double getPrice() {
        return price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
