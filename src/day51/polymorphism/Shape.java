package day51.polymorphism;

public abstract class Shape {
    public abstract void draw();
}

class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Draw Triangle");
    }
}

class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Rectange");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}


