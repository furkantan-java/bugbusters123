package day56;

import java.util.List;

public class Store {

    String name;
    List<Product> allProducts;

    public Store() {
        this.name = "Cybertek Store";
    }

    public Store(String name, List<Product>otherList){
        this();
        this.name = name;

        allProducts.addAll(otherList);
    }

}
