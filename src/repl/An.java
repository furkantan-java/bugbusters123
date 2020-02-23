package repl;

import java.util.ArrayList;
import java.util.List;

public class An {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add("2");
        List<Integer>a2 = new ArrayList<Integer>(Integer.parseInt(a1.get(0)));
        System.out.println(a2);
        Double a11 = 2d;

    }

}
