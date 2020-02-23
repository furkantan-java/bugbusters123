package day63;

import java.util.*;

public class GroceryMapPractice {

    public static void main(String[] args) {
        Map<String,Double> groceryList = new HashMap<>();
        groceryList.put("Tomato",1.99);
        groceryList.put("Patato",1.99);
        groceryList.put("Tomato",3.00);
        groceryList.put("Grape",3.99);
        groceryList.put("Banana",1.99);
        groceryList.put("Apple",1.89);
        groceryList.putIfAbsent("Fish",12.99);
        groceryList.putIfAbsent("Apple",100.0);

        System.out.println("groceryList.size() = " + groceryList.size());
        System.out.println("groceryList = " + groceryList);

        System.out.println("groceryList.get(\"Tomato\") = " + groceryList.get("Tomato"));
        groceryList.replace("Apple",groceryList.get("Apple")*2);
        System.out.println("groceryList.get(\"Apple\") = " + groceryList.get("Apple"));
        groceryList.replace("Banana",groceryList.get("Banana")-1);
        System.out.println("groceryList.get(\"Banana\") = " + groceryList.get("Banana"));

        if(groceryList.containsKey("Tomato")) {
            groceryList.remove("Tomato");
            System.out.println("NO MORE TOMATO!@");
            System.out.println("groceryList = " + groceryList);
        }
    }
}
