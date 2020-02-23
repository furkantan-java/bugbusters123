package day51;

import java.util.concurrent.CompletionException;

public class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person otherPerson) {

//        if(this.age == p2.age) return 0;
//        if(this.age>p2.age)return 1;
//        return-1;
        return this.name.compareTo(otherPerson.name);
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
