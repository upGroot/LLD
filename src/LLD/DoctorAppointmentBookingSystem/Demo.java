package LLD.DoctorAppointmentBookingSystem;

import java.util.*;

public class Demo {
    PatientController patientController;
    DoctorController doctorController;
    List<Booking> allBookings;
    public Demo() {
        patientController = PatientController.getInstance();
        doctorController =DoctorController.getInstance();
        allBookings = new ArrayList<>();
    }
    public void addDoctor(Doctor doctor) {
        doctorController.addDoctor(doctor);
        System.out.println("Welcome Dr. " + doctor.getName());
    }
    public void addPatient(Patient patient) {
        patientController.addPatient(patient);
    }
    public List<Doctor> getDoctors(DoctorType doctorType, RankingStrategy rankingStrategy) {
        return doctorController.getDoctorByCategory(doctorType, rankingStrategy);
    }
    public synchronized Booking bookAnAppointment(Patient patient, Doctor doctor, String time) {
        if (patientController.updatePatientSlot(patient, time)) {

        }
        return null;
    }
}
