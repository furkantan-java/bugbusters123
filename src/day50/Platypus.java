package day50;

class Mammal {
public Mammal(int age) {
        System.out.print("Mammal");
        }

        public Mammal() {

        }
}
public class Platypus extends Mammal {
public Platypus() {
        super();
        System.out.print("Platypus");
        }
public static void main(String[] args) {
        new Mammal(5);
        }
}
