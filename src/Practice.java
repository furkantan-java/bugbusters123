import java.util.ArrayList;
import java.util.Arrays;



public class Practice {
    public static void main(String[] args) {
int c;
int b;

c=1;
b=c;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        c++; //increment
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        //int arr[];
        int []arr = new int[1];//it gives the length of array
        arr[0]=12;
        int [] arr3;
        arr3=arr;
        arr[0]++;
        System.out.println(Arrays.toString(arr3));
        int a = arr.length;
        System.out.println(a);

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(12);
        arr1.add(13);
        arr1.add(1231);
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2=arr1;
        System.out.println(arr2);
    }
}
