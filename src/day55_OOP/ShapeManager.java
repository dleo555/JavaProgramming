package day55_OOP;
import day53_OOP_polymorphism.*;
import java.util.*;
public class ShapeManager {

    public static void drawSquare(Square squareObj){
        System.out.println("Drawing a square...");
        squareObj.draw();
    }
    public static void drawShape(Shape shapeObj){
        System.out.println("Drawing a shape - " + shapeObj.type+"...");
        shapeObj.draw();
    }
    public static void drawShape(List<Shape> shapeList){
        for(Shape each : shapeList) {
            System.out.println("Drawing a shape - " + each.type + "...");
            each.draw();
        }
    }
    public static void drawShapeFromObject(Object object){
        System.out.println("Drawing shape from object...");
        System.out.println(object.getClass().getSimpleName());
    }
}
