package LLD.ConcertTicketBookingSystem;

import java.sql.*;
import java.util.*;
import java.util.Date;

public class Concert {
    private String concertId;
    private String concertName;
    Artist artist;
    Date date;
    Time concertTime;
    List<Seat> bookedSeats;
}
