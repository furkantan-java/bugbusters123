package day49;

public interface Autonomous {

    public abstract void selfDrive();


    public default void wheel(){
        System.out.println("You have 4 wheel");
    }

    public static void screen(){
        System.out.println("Road info on screen");
    }
}
