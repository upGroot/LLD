package LLD.BookMyShow;

import java.util.*;

public class MovieController{
    private Map<City, List<Movie>> cityListMap;
    private List<Movie> allMovies;

    public void addMovie(List<Movie> movie, City city) {
        if(cityListMap.containsKey(city)) {
            List<Movie> movies = cityListMap.get(city);
            movies.addAll(movie);
            cityListMap.put(city, movies);
        }
        else cityListMap.put(city, movie);
    }
    public List<Movie> getMovieByCity(City city) {
        return null;
    }
    public void removeMovieByCity(City city, Movie movie) {

    }
}
