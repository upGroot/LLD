package LLD.DoctorAppointmentBookingSystem;

import javax.print.*;
import java.util.*;

public class DoctorController {
    List<Doctor> doctorList;
    public static DoctorController instance;
    Map<DoctorType, List<Doctor>> doctorTypeListMap;
    public DoctorController() {
        doctorList = new ArrayList<>();
        doctorTypeListMap = new HashMap<>();
    }
    public static synchronized DoctorController getInstance() {
        if (instance == null) {
            instance = new DoctorController();
        }
        return instance;
    }
    public void addDoctor(Doctor doctor) {
        doctorList.add(doctor);
    }
    public Doctor getDoctorById(String id) {
        for (Doctor doctor : doctorList) {
            if (doctor.getId().equalsIgnoreCase(id)) return doctor;
        }
        return null;
    }
    public List<Doctor> getDoctorByCategory(DoctorType doctorType, RankingStrategy rankingStrategy) {
        return doctorTypeListMap.get(doctorType);
    }
    public void updateDoctorSlot(Doctor doctor, String time) {
        List<Slot> slots = doctor.getAvailableSlot();
        for (Slot slot : slots) {
            if (slot.getTime().equalsIgnoreCase(time)) {
                slot.setSlotStatus(SlotStatus.BOOKED);
            }
        }
    }
    public void cancelBookedSlot(Doctor doctor, String time) {
        List<Slot> slots = doctor.getAvailableSlot();
        for (Slot slot : slots) {
            if (slot.getTime().equalsIgnoreCase(time)) {
                slot.setSlotStatus(SlotStatus.NOT_BOOKED);
            }
        }
    }
    public void addSlotsToDoctor(Doctor doctor, Slot slot) {
        if (isValidSlot(slot.getTime()))
            doctor.getAvailableSlot().add(slot);
        else
            System.out.println("Sorry Dr. " + doctor.getName() +  " slots are 30 mins only");
    }
    public boolean isValidSlot(String time) {
        if (time.equalsIgnoreCase("")) return false;
        return true;
    }
}
