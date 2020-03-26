package day53_OOP_polymorphism;

public class ShapeTest {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Shape shape = new Shape();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Diamond diamond = new Diamond();

        shape.draw();
        square.draw();
        triangle.draw();
        diamond.draw();

        System.out.println("=========================================");
        //polymorphism
        Shape shape1 = new Square();
        shape1.draw();

        shape1 = new Triangle();
        shape1.draw();

        new Triangle().draw();

        //create 4 shapes using polymorphism
        System.out.println("++++++++++++++++++++++++++++++++++++====++");
        Object shapeObj = new Shape();
        Shape square1 = new Square();
        Shape triangle1 = new Triangle();
        Shape diamond1 = new Diamond();


        square1.draw();
        triangle1.draw();
        diamond1.draw();



    }
}
