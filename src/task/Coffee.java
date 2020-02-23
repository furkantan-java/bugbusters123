package task;

public class Coffee {
    private String type;
    private double price;
    private int caffeineLevel;

    public Coffee(){
        System.out.println("no arg constructor");
    }

    public Coffee(String type, int caffeineLevel){
        this.type = type;
        this.caffeineLevel = caffeineLevel;
        System.out.println("2 args constructor");

    }

    public Coffee(String type, int caffeineLevel, double price){
        this.type = type;
        this.caffeineLevel = caffeineLevel;
        if(price>0) {
            this.price = price;
        } else {
            this.price = 1;
        }
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", caffeineLevel=" + caffeineLevel +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCaffeineLevel() {
        return caffeineLevel;
    }

    public void setCaffeineLevel(int caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }
}
