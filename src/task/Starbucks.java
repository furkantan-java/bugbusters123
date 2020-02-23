package task;

import java.util.ArrayList;
import java.util.List;

public class Starbucks {
    public static void main(String[] args) {
Coffee c1 = new Coffee();
c1.setCaffeineLevel(12);
        System.out.println("c1 = " + c1);

        List<String> lst = new ArrayList<>();
        lst.add("abc");
        lst.add(null);
        lst.add(null);

        System.out.println(c1.getCaffeineLevel());
    }
}
