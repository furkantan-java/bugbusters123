package day50;

import org.w3c.dom.ls.LSOutput;

public class MathTest {
    public static void main(String[] args) {
        Addition q1 = new Addition(10,90);
        System.out.println("q1 before calc: " + q1);
        q1.calculate();
        System.out.println("q1 after calc: " + q1);


        Subtraction q2 = new Subtraction(2 ,1);

    }

}
