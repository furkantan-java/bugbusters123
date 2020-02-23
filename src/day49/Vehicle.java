package day49;

public abstract class Vehicle {
    String brand;
    public Vehicle(String brand){
        this.brand = brand;
    }

    public abstract void start();

    public void goForward(){
        System.out.println("going forward");
    }

}
