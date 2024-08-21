package LLD.DoctorAppointmentBookingSystem;

import java.util.*;

public abstract class RankingStrategy {
    public List<Doctor> getDoctors(Map<DoctorType, List<Doctor>> doctorTypeListMap, DoctorType doctorType) {
        return doctorTypeListMap.get(doctorType);
    }
}
