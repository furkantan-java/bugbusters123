package day62;

import java.util.Scanner;

public class Ay {
    public static void main(String[] args) {
         /*
        If Statement Questions
1- Write a Java program to get a number from the user and print whether it is positive or negative.
Test Data
Input number: 35
Expected Output :
Number is positive
//         */ // FURKAN PLEASE MAKE SURE COOMENT OUT !ST TASK BEFORE RUNNING SECOND!!!
        Scanner scan = new Scanner (System.in);
//        System.out.println("Please enter the number: ");
//        int num = scan.nextInt();
//        if(num>0){
//            System.out.println("Positive NUmber");
//        }if(num<0){
//            System.out.println("Negative num");
//        }else {
//            System.out.println("Wrong input");
//        }

        /*
        2-  Take three numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87
         */
        int n1=25;
        int n2 = 78;
        int n3 = 87;
        if(n1>n2 && n1>n3){
            System.out.println(n1+ " is the largest number");
        } else if(n2>n1 && n2>n3){
            System.out.println(n2 +" is the greatest number");
        }else if (n3>n1 && n3>n2){
            System.out.println(n3 +" is the greatest number");
        }
        /*
        3-Write a Java program that keeps a number from the user and
        generates an integer between 1 and 7 and displays the name of the weekday.
Test Data
Input number: 3
Expected Output :
Wednesday
         */
//        int[] array = {1, 2, 3, 4, 5};
//        Arrays.sort(array);
//        Arrays.toString(array);
        Scanner Weekdays = new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
        int dayOfWeek=scan.nextInt();
        if(dayOfWeek==1) {
            System.out.println("Monday");
        } if(dayOfWeek==2) {
            System.out.println("its a Tuesday");
        }if(dayOfWeek==3) {
            System.out.println("its Wednsday");
        } if(dayOfWeek==4) {
            System.out.println("its a Thursday");
        }if (dayOfWeek==5) {
            System.out.println("its a Friday");
        } if (dayOfWeek==6) {
            System.out.println("its a Saturday");
        }else if(dayOfWeek==7) {
            System.out.println("Its a Sunday");
        }

    }
}
