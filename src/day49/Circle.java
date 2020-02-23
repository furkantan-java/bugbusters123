package day49;

public class Circle extends Shape{

    double radius;

    public void calculateArea(){

    }

    public void draw(){

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
