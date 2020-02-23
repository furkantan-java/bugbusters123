package practice;

import java.util.Scanner;

public class ReplDoWhile {

    public static void main(String[] args) {

        Scanner scan = new Scanner( System.in);
        String name = "";
        String doWeHaveAnyGuest = "";
        boolean keepGoing = true;
        String list = "";
        do {
            System.out.println("Please enter guest name:");
            name = scan.next();//ayah
            System.out.println("Do you want to enter new guest name:");
            doWeHaveAnyGuest = scan.next();//no
            if (doWeHaveAnyGuest.equals("yes")) {
                keepGoing = true;
                list = list + name + ", ";
            } else if (doWeHaveAnyGuest.equals("no")) {
                keepGoing = false;
                list = list + name ;
            }
        } while ( keepGoing );

        System.out.println("Guest's list: " + list);

//        while( keepGoing){
//            System.out.println("Please enter guest name:");
//            name = scan.next();//ayse
//            list = list + name + ", "; //furkan, ayse,
//            System.out.println("Do you want to enter new guest name:");
//            doWeHaveAnyGuest = scan.next();
//            if (doWeHaveAnyGuest.equals("yes")) {
//                keepGoing = true;
//            } else if (doWeHaveAnyGuest.equals("no")) {
//                keepGoing = false;
//            }
//        }

        do {
            System.out.println("Please enter guest name:");
            name = scan.next();//ayah
            System.out.println("Do you want to enter new guest name:");
            doWeHaveAnyGuest = scan.next();//no
            if (doWeHaveAnyGuest.equals("yes")) {
                keepGoing = true;
                list = list + name + ", ";
            } else if (doWeHaveAnyGuest.equals("no")) {
                keepGoing = false;
                list = list + name ;
            }
        } while ( keepGoing );

        System.out.println("Guest's list: " + list);


    }
}
