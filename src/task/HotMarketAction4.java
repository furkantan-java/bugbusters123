package task;

import java.util.ArrayList;

public class HotMarketAction4 {
    public static void main(String[] args) {
        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;
        String o1str = o1.toString();
        System.out.println("o1str = " + o1str);
        System.out.println(o1.toString());
        System.out.println(o1);
        Offer o4 = new Offer();

        o1.company = "111Apple";
        o1.location = "111Austin";
        o1.isFullTime = true;
        o1.salary = 111140000;

        ArrayList<Offer> myOffers = new ArrayList<>();
        myOffers.add(o1);
        myOffers.add(o4);

        System.out.println(myOffers);
    }
}
