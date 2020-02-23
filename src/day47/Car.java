package day47;

public abstract class Car {

    int year;
    String brand;

    public abstract void start ();
    public abstract void goForward();
    public abstract void goBackward();
    public abstract void turn(String direction);
}
