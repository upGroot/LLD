package LLD.DoctorAppointmentBookingSystem;

import java.util.*;

public class Patient {
    private String name;
    private String id;
    private String address;
    List<Booking> bookedAppointment;

    public Patient(String name, String id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
        bookedAppointment = new ArrayList<>();
    }

    public List<Booking> getBookedAppointment() {
        return bookedAppointment;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }
}
