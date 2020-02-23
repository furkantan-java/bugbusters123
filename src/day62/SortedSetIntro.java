package day62;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetIntro {
    public static void main(String[] args) {
        SortedSet<Integer> mySet = new TreeSet<>();
        mySet.add(70);
        mySet.add(70);
        mySet.add(90);
        mySet.add(30);
        mySet.add(50);
        mySet.add(65);
        mySet.add(35);
        mySet.add(30);

        System.out.println("mySet = " + mySet);
        System.out.println("mySet.first() = " + mySet.first());
        System.out.println("mySet.last() = " + mySet.last());
        String name = "I am very happy";

        ArrayList<Integer> str = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        str.add(10);
        str.forEach(each -> System.out.println(each));
    }
}
