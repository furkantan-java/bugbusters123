package task;

import java.util.Scanner;

public class BubbleSort {
    public static void swap(int first, int second) {
        int temp = first;
        first = second;
        second = temp;
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void printArray(int arr[]) {
        for (int each : arr) {
            System.out.print(each + " ");
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 numbers:");
        int[] arr = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};
        bubbleSort(arr);
        printArray(arr);
    }

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter 5 numbers:");
//
//
//        for(int j = 0 ; j<arr.length-1;j++){
//
//            for (int i = 0; i < arr.length - 1; i++) {
//                int temp = 0;
//                if (arr[i] > arr[i + 1]) {
//                    temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
//    }
}
