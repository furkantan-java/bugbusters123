package review;

import java.util.*;

public class ListToMapPractice {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Alisa Zakirova","Ayse Golcu","Ahmet Baltaci","Daria Ozer",
                "Fatih Demir","Fatma Ulusal","Furkan Tan","Gulzina Pakzat","Huseyin Civan","Guvanch Kurbanov","Muge Orman",
                "Rabiyam Rustam","Semra Bahadir","Serife Kilic"));

        Map<String, Integer> nameCharCounter = new HashMap<>();
        for (String eachMember : names ) {
            nameCharCounter.put(eachMember,eachMember.length());
        }

        System.out.println(nameCharCounter);
    }
}
