package LLD.TurfBookingSystem;

import java.util.*;

public class Owner {
    private int id;
    private String name;
    private List<Turf> ownedTurf;

    public Owner(int id, String name) {
        this.id = id;
        this.name = name;
        ownedTurf = new ArrayList<>();
    }
    public void addTurf(Turf turf) {
        ownedTurf.add(turf);
    }
}
