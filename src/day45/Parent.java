package day45;

public class Parent {

    static String name;
    int SSN;
    int age;
    int a = 1000;

    public static void main(String[] args) {


                int i = 1;

                while (i <= 5) {

                    System.out.println("Outer loop iteration " + i);
                    for (int j = 1; j <= 2; ++j) {
                        System.out.println("i = " + i + "; j = " + j);
                    }

                    ++i;
                }


    }

    public static void hello(){
        System.out.println("Hello");

    }
}
