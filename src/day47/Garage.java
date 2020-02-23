package day47;

public class Garage {

    public static void main(String[] args) {

        ElectricCar c1 = new ElectricCar();
        c1.start();
        c1.goForward();
        c1.goBackward();
        c1.turn("right");

        GasCar c2 = new GasCar();
        c2.start();
        c2.goForward();
        c2.goBackward();
        c2.turn("left");
    }
}
