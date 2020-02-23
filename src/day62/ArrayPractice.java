package day62;

import java.util.ArrayList;

public class ArrayPractice {
    public static void main(String[] args) {


        int[] arr = {12, 51, 23, 2};
        ArrayList<Integer> result = new ArrayList<>();
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (!result.contains(arr[i])) {
                    if (arr[j] < min) {
                        min = arr[j];
                    }
                }
            }
            result.set(i,min);

        }
        System.out.println(result);
    }


}

