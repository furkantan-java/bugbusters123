package task;

public class Zapping {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        t1.turnOn();
        t1.moveForward();
        t1.moveForward();
        t1.moveForward();
        System.out.println("t1 = " + t1);
        t1.moveBackward();
        System.out.println("t1 = " + t1);
        System.out.println(t1.toString());
//        Tv t1 = new Tv();
//        t1.brand = "Sony";
//        t1.currentChannel = 2000;
//
//        System.out.println("t1 = " + t1.toString());
//        t1.turnOn();
//        t1.setCurrentChannel(12);
//        t1.setCurrentChannel(121);
//t1.moveForward();
//t1.moveBackward();
//        System.out.println(t1.getCurrentChannel());
//
//
//        t1.turnOff();
//
//        System.out.println("t1 = " + t1.toString());
    }
}
