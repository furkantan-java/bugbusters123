package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task {

    public static void main(String[] args) {

        Set<String> states = new HashSet<>(Arrays.asList("Florida", "California", "Texas", "New York"));
        //Iterator<String> lst = (Iterator<String>) states;
        System.out.println("1st way for each");
        for (String each : states
        ) {
            System.out.println(each);

        }
        System.out.println("2nd way lambda");
        states.forEach(each -> System.out.println(each));
        System.out.println("3rd way iterator");
        states.removeIf(each -> each.contains("a"));
        Iterator<String> myIterator = states.iterator();
//        while (myIterator.hasNext()) {
//            if (myIterator.next().contains("a")){
//                myIterator.remove();
//
//            }
//                //System.out.println(myIterator.next());
//        }
        System.out.println(states);
//        Iterator<String> myIter = states.iterator();
//        while (myIter.hasNext()){
//            System.out.println("states = " + myIter.next());
//        }


    }
}
