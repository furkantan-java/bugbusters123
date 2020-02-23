package day56;

public class StoreTest {
    public static void main(String[] args) {
        Store s1 = new Store();
        System.out.println(s1.name);
        System.out.println(s1.allProducts);

        s1.allProducts.add(new Product("imac",3999));
        System.out.println(s1.allProducts);
    }
}
