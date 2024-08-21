package LLD.TurfBookingSystem;

import java.util.*;

public class TurfManager {
    List<Turf> turfList;
    public static TurfManager instance;
    private TurfManager() {
        turfList = new ArrayList<>();
    }
    public static TurfManager getInstance() {
        if (instance == null) {
            synchronized (TurfManager.class) {
                if (instance == null)
                    instance = new TurfManager();
            }
        }
        return instance;
    }
    public void addTurf(Turf turf) {
        turfList.add(turf);
    }
    public List<Turf> getTurfByLocationId(long id) {
        List<Turf> turfByLocation = new ArrayList<>();
        for (Turf turf : turfList) {
            if (turf.getLocationId() == id) turfByLocation.add(turf);
        }
        return turfByLocation;
    }

}
