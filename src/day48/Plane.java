package day48;

public class Plane implements Flyable{

String name;
int capacity;
int speed;
    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }
}
