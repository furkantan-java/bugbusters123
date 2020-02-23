package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySetView {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        Set<Map.Entry<String, Double>> entryView = groceryPriceMap.entrySet();

        for (Map.Entry<String, Double> each : entryView) {
            System.out.println("each.getKey() = " + each.getKey());
            System.out.println("each.getValue() = " + each.getValue());
            if (each.getKey().length() == 5) {
                each.setValue(5.99);
                System.out.println("NEW VALUE:::::::");
                System.out.println("each = " + each);
            }
            

        }

    }
}
