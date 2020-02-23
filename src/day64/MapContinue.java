package day64;

import java.util.*;

public class MapContinue {

    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        Set <String> allNames = groceryPriceMap.keySet();
//        System.out.println("allNames = " + allNames);
//        allNames.remove("Tomato");
//        System.out.println("allNames = " + allNames);
//        System.out.println("groceryPriceMap = " + groceryPriceMap);
        Set<String> namesCopy = new HashSet<>(allNames);
        System.out.println("namesCopy = " + namesCopy);
        namesCopy.remove("Tomato");
        System.out.println("namesCopy = " + namesCopy);
        System.out.println("allNames = " + allNames);


    }
}
