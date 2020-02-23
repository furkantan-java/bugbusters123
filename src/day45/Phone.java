package day45;

public class Phone extends Electronic{
    double size;
    double price;

    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.size = 12;
        p1.price = 399;
        p1.brand = "Apple";
        System.out.println(Electronic.useElectricity);
        System.out.println(Phone.useElectricity);
        System.out.println(useElectricity);

        p1.showBrand();

        displayUseElectricity();
        Electronic.displayUseElectricity();
        Phone.displayUseElectricity();
    }
}
