package day54;

public class Utility {

    public static void main(String[] args) {
        Wearable w1 = new Clothes();
       wearMyWearable(w1);
        Wearable w2 = new Perfume();
        wearMyWearable(w2);
        Wearable w3 = new Watch();
        wearMyWearable(w3);
        Wearable w4 = new MakeUps();
        wearMyWearable(w4);

int [] arr = new int[3];
arr = new int[]{1, 2, 3};
    }

    


    public static void wearMyWearable (Wearable wear){
        wear.wear();
    }
}
