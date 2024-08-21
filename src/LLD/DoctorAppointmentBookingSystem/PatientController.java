package LLD.DoctorAppointmentBookingSystem;

import java.util.*;

public class PatientController {
    private List<Patient> patientList;
    public static PatientController instance;

    public PatientController() {
        patientList = new ArrayList<>();
    }
    public static synchronized PatientController getInstance() {
        if (instance == null) {
            instance = new PatientController();
        }
        return instance;
    }
    public void addPatient(Patient patient) {
        patientList.add(patient);
    }
    public Patient getPatientById(java.lang.String id) {
        for (Patient patient : patientList) {
            if (patient.getId().equalsIgnoreCase(id)) return patient;
        }
        return null;
    }

    public List<Booking> getAllAppointment(Patient patient) {
        return patient.getBookedAppointment();
    }
    public boolean updatePatientSlot(Patient patient, String appointmentTime) {
        List<Booking> bookings = patient.getBookedAppointment();
        for (Booking booking : bookings) {
            if (booking.getTime().equalsIgnoreCase(appointmentTime));
            {
                System.out.println("Sorry You Cannot make two booking at the same time slot");
                return false;
            }
        }
        return true;
    }
    public boolean cancelBookedSlot(Patient patient, Booking appointment) {
        List<Booking> bookings = patient.getBookedAppointment();
        for (Booking booking : bookings) {
            if (booking.getTime().equalsIgnoreCase(appointment.getTime()));
            {
                bookings.remove(booking);
                return true;
            }
        }
        return false;
    }
}

