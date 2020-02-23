package poli;

public class Furkan extends Man {

    String googles;


    void surname(){
        System.out.println("tan");
    }
    public static void main(String[] args) {
        Furkan f1 = new Furkan();
        Man m1 = new Furkan();
        Object o1 = new Furkan();

        System.out.println(f1.getClass().getSimpleName());
    }
}
