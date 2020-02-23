package task;

import java.util.ArrayList;

public class Movie {
    String name;
    double length;
    String type;


    public Movie(String name, double length, String type){
        this.name = name;
        this.length = length;
        this.type = type;
    }

    @Override
    public String toString() {
        return"Movie{" +
                "name='" + this.name + '\'' +
                ", length=" + this.length +
                ", type='" + this.type + '\'' +
                '}';
    }

    public void setType(double length) {
        if(length>2){
            this.type = "Long" + type;
        }
    }
    public void shorterThan2Hours(Movie movie){
        if(movie.length<2){
            System.out.println(movie.toString());
        }
    }

    public void getActionMovies(Movie movie){
            if(movie.type.contains("Action")){
                System.out.println(movie.toString());
            }
    }
    public double getLongest(ArrayList<Movie>movieList){
        double max = movieList.get(1).length;
        for(Movie each : movieList){
            if(each.length>max){
                max = each.length;
            }
        }
        return max;
    }

    //    String name;
//    double length;
//    String type;
//
//    public Movie(){
//        System.out.println("Empty Movie");
//    }
//
//    public Movie(String name, double length, String type) {
//        this.name = name;
//        this.length = length;
//        this.type = type;
//    }
//
//    public String toString(){
//        return "Movie{" + "name=" + name + " type=" + type + " Length= " + length + "}";
//    }
}
