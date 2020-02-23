package review;

public abstract class Human {

    int weight;
    String name;


    public static void abc(){

    }

    abstract void aaa();
    public Human(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }

    public Human() {
this.name = "Ali";
this.weight = 12;
    }

    public static void main(String[] args) {
        
    }
    @Override
    public String toString() {
        return "Human{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
