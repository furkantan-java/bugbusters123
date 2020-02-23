package task;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieNight {

    public static void main(String[] args) {
        Movie movie1 = new Movie("LOTR", 3, "Fantasy");
        Movie movie2 = new Movie("I am legend", 1.59, "Action");
        Movie movie3 = new Movie("Up", 1.30, "Animation");
        Movie movie4 = new Movie("Joker", 1.59, "Drama");
        Movie movie5 = new Movie("9", 1.30, "Animation");
        Movie movie6 = new Movie("Irishman", 3, "Action");
        Movie movie7 = new Movie("Rick&Morty", 4, "SciFi");
        Movie movie8 = new Movie("Happy Hour", 2.1, "Action");
        Movie movie9 = new Movie("Harry Potter", 5, "Fantasy");
        Movie movie10 = new Movie("Zootrapolis", 2.1, "Animation");
        Movie movie11 = new Movie("Zootrapolis", 2.1, "Animation");

        ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(new Movie[]{movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10}));
        System.out.println(movies);
        System.out.println("-------");
        for (Movie each : movies) {
            each.shorterThan2Hours(each);
        }
        System.out.println("-------");
        for (Movie each : movies) {
            each.getActionMovies(each);
            each.setType(each.length);

        }
        System.out.println("-------");

        System.out.println(movies);
        System.out.println("-------");
        System.out.println(movie11.getLongest(movies));
    }
}
