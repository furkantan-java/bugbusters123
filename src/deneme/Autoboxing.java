package deneme;

public class Autoboxing {

    public static void main(String[] args) {
        int x = 20 ;
        Integer y = new Integer (20);

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int a =  y;
        System.out.println("a = " + a);
        Integer b = x;
        System.out.println("b = " + b);

    }
}
