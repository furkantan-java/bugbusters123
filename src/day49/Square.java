package day49;

public class Square extends Shape {
    int length;

    @Override
    public void calculateArea() {
area = length * length;
    }

    @Override
    public void draw() {
        System.out.println("Draw 4 equal line with length " + length);
    }

    @Override
    public String
    toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
