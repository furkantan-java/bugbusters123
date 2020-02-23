package day51.polymorphism;

public class Animal {

    public void makeNoise(){
        System.out.println("general animal noise");
    }
}

class Dog extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("WOFF!!!");
    }
}

        class Horse extends Animal{
    public void makeNoise(){
        System.out.println("NEINEI");
    }
        }
