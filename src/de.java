import java.util.Arrays;

public class de {
    public static void main(String args[]) {
        int[] arr = {2,8, 1, 3, 7, 2, 4, 5};
        int temp;
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));

    }
}


