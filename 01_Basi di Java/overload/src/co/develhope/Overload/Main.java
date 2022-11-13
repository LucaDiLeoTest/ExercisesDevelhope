package co.develhope.Overload;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.getShapeDetails());

        Shape circle = new Shape(3.15);
        System.out.println(circle.getShapeDetails());

        Shape square = new Shape(4, 20 );
        System.out.println(square.getShapeDetails());

        Shape rectangle = new Shape(4, 2, 3 );
        System.out.println(rectangle.getShapeDetails());

        Shape triangle = new Shape(3, 2, 3, 5);
        System.out.println(triangle.getShapeDetails());


    }
}