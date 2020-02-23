package package1;

import day48.Animal;
import day51.Person;

public class Compara implements Comparable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static void main(String[] args) {

        Object o1 = new Object();
        Object o2 = new Object();

        Object o3 = new Object();

        System.out.println("o3 = " + o3);
    }
}
