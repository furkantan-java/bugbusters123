package day62;

import java.lang.reflect.Array;
import java.util.*;

public class SetInterfaceIntro {
    public static void main(String[] args) {

        Set<Integer> myNums = new HashSet<>();
        myNums.add(10);
        myNums.add(10);
        myNums.add(10);
        myNums.add(10);
        myNums.add(10);
        myNums.add(10);
        myNums.add(10);
        myNums.add(10);
        myNums.add(10);
        myNums.add(2);
        System.out.println(myNums);


        List<Integer> lst = new ArrayList<>(Arrays.asList(10,1,10,12,13,10,20,20));
        Set<Integer> lst2 = new HashSet<>();
        lst2.addAll(lst);
        System.out.println(lst2);
        System.out.println(lst2);
        System.out.println(lst2);
        System.out.println(lst2);

    }
}
