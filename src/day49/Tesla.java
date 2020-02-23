package day49;

public class Tesla extends Vehicle implements Autonomous{
    int horsePower;

    public static void main(String[] args) {
        Tesla s = new Tesla("ModelX");

        s.start();
        s.horsePower=200;
        s.selfDrive();
        System.out.println(s);
        s.wheel();
    }

    public void wheel(){
        System.out.println("you have 5 wheel");
    }

    public Tesla(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Starting your Tesla");
    }

    @Override
    public void selfDrive() {
        System.out.println("Your Tesla is in self drive mode");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", brand='" + brand + '\'' +
                '}';
    }
}
