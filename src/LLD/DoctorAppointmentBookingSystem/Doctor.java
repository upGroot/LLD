package LLD.DoctorAppointmentBookingSystem;

import java.util.*;

public class Doctor {
    private java.lang.String id;
    private java.lang.String name;
    List<Slot> availableSlot;
    DoctorType doctorType;
    public Doctor(java.lang.String id, java.lang.String name, DoctorType doctorType) {
        this.id = id;
        this.name = name;
        this.doctorType = doctorType;
        availableSlot = new ArrayList<>();
    }

    public java.lang.String getId() {
        return id;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public List<Slot> getAvailableSlot() {
        return availableSlot;
    }

    public void setAvailableSlot(List<Slot> availableSlot) {
        this.availableSlot = availableSlot;
    }

    public DoctorType getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(DoctorType doctorType) {
        this.doctorType = doctorType;
    }
}
