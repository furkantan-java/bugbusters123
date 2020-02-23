package day56;

public class ProductTest extends Object{

    public static void main(String[] args) {
        Product p1 = new Product("Macbook", 2999);
        System.out.println(p1.toString());
        Product p2 = new Product("Sony TV", 499);
        Product p3 = new Product("Sony TV", 499);
        System.out.println(p1==p2);
        System.out.println(p2==p3);

        System.out.println(p2.equals(p3));
        System.out.println(p2.equals(p2));


    }
}
