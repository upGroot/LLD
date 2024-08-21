package LLD.BookMyShow;

import java.util.*;

public class BookMyShow {
    MovieController movieController;
    TheatreController theatreController;
    BookMyShow() {
        movieController = new MovieController();
        theatreController = new TheatreController();
    }
    public static void main(String[] args){
      BookMyShow bookMyShow = new BookMyShow();
      bookMyShow.initialize();
    }
    public void initialize() {
        createMovie();
        createTheatre();
    }

    private void createMovie() {
        Movie movie1 = new Movie(101, "KALKI", "183");
        Movie movie2= new Movie(102, "KILL", "146");
        List<Movie> movies = new ArrayList<>();
        City city1 = new City("MUMBAI");
        City city2 = new City("DELHI");
        movies.add(movie1);
        movies.add(movie2);
        movieController.addMovie(movies, city1);
        movieController.addMovie(new ArrayList<>((Collection)movie2), city2);
    }

    private void createTheatre() {
        Screen screen = new Screen();
//        List<Seat> seat = new Seat(1);
//        Theatre theatre1 = new Theatre(11, );

    }
}

