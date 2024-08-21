package LLD.ConcertTicketBookingSystem;

public class Venue {
    private String venueId;
    private String venueName;
    private String venueAddress;
    public Venue(String venueAddress, String venueId, String venueName) {
        this.venueAddress = venueAddress;
        this.venueId = venueId;
        this.venueName = venueName;
    }
}
