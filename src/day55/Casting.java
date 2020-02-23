package day55;

import day45.Dog;

public class Casting {

    public static void main(String[] args) {
        int x = 10;

        long y = x;

        byte b = (byte) x;

        Object o = new Dog();

        Dog a = (Dog)o;
        a.speak();


    }
}
