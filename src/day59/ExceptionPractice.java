package day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {
        String name = "Furkan";

        Scanner scan = new Scanner(System.in);

        System.out.println("Write something");


        try {
            int target = scan.nextInt();
            System.out.println(name.charAt(target));
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Something unusual Happen ");
        }
        catch (InputMismatchException e1){
            System.out.println("input missmatch");
        }

        System.out.println("The end");
    }
}
