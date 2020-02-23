package day47;

public class GasCar extends Car {

    int gasLevel;

    public void start(){
        System.out.println("Starting gascar");
    }

    public void goForward(){
        System.out.println("Go forward");
    }

    public void goBackward(){
        System.out.println("go backward");
    }

    public void turn(String direction){
        System.out.println("Turn " + direction);
    }
}
