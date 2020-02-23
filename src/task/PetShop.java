package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetShop {
    public static void main(String[] args) {
        Pet pet1 = new Pet("bobo", "dog");
        Pet pet2 = new Pet("wisky", "cat");
        Pet pet3 = new Pet("ketn", "cat");
        Pet pet4 = new Pet("ciko", "dog");
        Pet pet5 = new Pet("kit", "cow");
        Pet pet6 = new Pet("tink", "cat");
        Pet pet7 = new Pet("dede", "horse");
        Pet pet8 = new Pet("ket", "cat");
        List<Pet>list = new ArrayList<Pet>(Arrays.asList(pet2,pet1,pet3,pet4,pet5,pet6,pet7,pet8));
        System.out.println(list);
    }
}
