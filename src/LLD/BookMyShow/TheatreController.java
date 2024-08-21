package LLD.BookMyShow;

import java.util.*;

public class TheatreController {
    Map<City, List<Theatre>> cityToTheatre;
    List<Theatre> allTheatres;
    public void addTheatre(List<Theatre> theatre, City city) {
        if(cityToTheatre.containsKey(city)) {
            List<Theatre> theatres = cityToTheatre.get(city);
            theatres.addAll(theatre);
            cityToTheatre.put(city, theatres);
        }
        else cityToTheatre.put(city, theatre);
    }
}
