package day51;


import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparing {

    public static void main(String[] args) {

        List<Person> lst = new ArrayList<>();
        Person p1 = new Person("Arafat", 34);
        Person p3 = new Person("Ahmet", 54);
        Person p4 = new Person("Kıta", 14);
        Person p2 = new Person("Zhibekchach", 18);
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        lst.add(p4);



        Collections.sort(lst);
        System.out.println("lst = " + lst);
    }
}
