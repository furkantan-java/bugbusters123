package day44;

public class Vehicle {
    String make;
    private int year;

    public void start(){
        System.out.println("starting " + make);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void goForward(){
        System.out.println(make + " is going forward");
    }

}
