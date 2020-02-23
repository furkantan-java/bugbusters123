package day48;

public class Lion extends Mamals {
    public static void main(String[] args) {
//        Lion l1 = new Lion();
//        l1.drinkMilk();
//        l1.makeNoise();

        Animal a1 = new Lion();
        a1.makeNoise();

    }
    @Override
    public void drinkMilk() {
        System.out.println("Drink milk");
    }

    @Override
    public void makeNoise() {
        System.out.println("Roarr");
    }
}
