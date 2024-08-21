package LLD.ConcertTicketBookingSystem;

import java.util.*;

public class ConcertController {
    public static ConcertController instance;
    Map<String, List<Concert>> venueIdToConcertList;
    Map<String, List<Concert>> artistIdToConcertList;
    List<Concert> allConcerts;
    public ConcertController() {
        venueIdToConcertList = new HashMap<>();
        artistIdToConcertList = new HashMap<>();
    }

    public static ConcertController getInstance() {
        if (instance == null)
            instance = new ConcertController();
        return instance;
    }

    public void addConcert(Concert concert) {

    }
    public void removeConcert(Concert concert) {

    }
    public List<Concert> searchConcertsByVenue(Venue venue) {
        return null;
    }
    public List<Concert> searchConcertByArtist(Artist artist) {
        return null;
    }
    public List<Concert> searchConcert(Date date, Artist artist, Venue venue) {
        return null;
    }
}
