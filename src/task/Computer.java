package task;

public class Computer {
    private String brand;
    private int ram;
    private double price;

    public void runProgram(int ram){
        if(ram>=1 && ram <=128){
            System.out.println(this.brand + " is running program with the ram size " + this.ram);
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        if(price>=1&& ram<=128){
            this.ram = ram;
        }
    }

    public int getRam() {
        return ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void calculate(){
        System.out.println(brand + " is calculating");
    }


}
