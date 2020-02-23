package day52;

public class ShapePolymorphism {

    public static void main(String[] args) {


        //Circle s1 = new Circle("penny",5);
        Shape s1 = new Circle("penny",5);
        //Object s1 = new Circle("penny",5);
        //Drawable s1 = new Circle ("penny",5);
Shape s2 = new Rectangle("Book", 10 , 5);
Shape s3 = new Square("Bob", 6);
        //Only the reference type decide what you can access with that variable
//        s1.draw();
//        s1.draw();

        System.out.println(s1.toString());

        System.out.println(s1.getClass().getSimpleName());


        printAnyShapeArea(s1);
        printAnyShapeArea(s2);
        printAnyShapeArea(s3);

        drawShape3Times(s1);
        drawShape3Times(s2);
        drawShape3Times(s3);
    }
public static void drawShape3Times(Shape anyShape){
        anyShape.draw();
        anyShape.draw();
        anyShape.draw();
}
    public static void printAnyShapeArea(Shape anyShape){
        anyShape.calculateArea();
        System.out.println(anyShape.area);
    }
}

