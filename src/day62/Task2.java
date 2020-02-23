package day62;

import java.util.Scanner;

public class Task2 {
    //(e)Enter the numbers from console, then output the max number and its index
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int max = nums[0];
        int x;
        for (x = 0; x < nums.length; x++) {
            if (nums[x] > max) {
                max = nums[x];
            }
        }
        System.out.println("max number is :" + max);
    }

}
