package LLD.TurfBookingSystem;

import lombok.*;
import java.sql.*;

@Getter
@Setter
public class Slot {
    private Time time;
    SlotStatus status;
    public Slot(Time time) {
        this.time = time;
        this.status = SlotStatus.NOT_BOOKED;
    }
}
