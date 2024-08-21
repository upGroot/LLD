package LLD.TurfBookingSystem;

import lombok.*;

import java.util.*;

@Setter
@Getter
public class Turf {

    private int id;
    private String name;
    private long locationId;
    private List<Slot> turfSlots;

    public Turf(int id, String name, long locationId, List<Slot> turfSlots) {
        this.id = id;
        this.name = name;
        this.locationId = locationId;
        this.turfSlots = turfSlots;
    }
    public void addSlotToTurf(Slot slot) {
        turfSlots.add(slot);
    }
    public List<Slot> getAllAvailableSlots() {
        List<Slot> availableSlots = new ArrayList<>();
        for (Slot slot : turfSlots) {
            if (slot.status == SlotStatus.BOOKED) availableSlots.add(slot);
        }
        return availableSlots;
    }
}
