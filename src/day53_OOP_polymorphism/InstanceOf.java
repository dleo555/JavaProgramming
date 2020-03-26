package day53_OOP_polymorphism;
import java.util.*;
public class InstanceOf {
    public static void main(String[] args) {
        Shape diamond = new Diamond();
        System.out.println(diamond.getClass().getSimpleName());

        Shape square = new Square();
        System.out.println(square.getClass().getSimpleName());

        if (square instanceof Square){
            System.out.println("square object");
        } else if (diamond instanceof Diamond ) {
            System.out.println("diamond object");
        }

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Shape());
        shapeList.add(new Square());
        shapeList.add(new Square());
        shapeList.add(new Diamond());
        shapeList.add(new Triangle());
        shapeList.add(new Shape());
        shapeList.add(new Square());
        shapeList.add(new Square());
        shapeList.add(new Diamond());
        shapeList.add(new Triangle());
        shapeList.add(new Shape());
        shapeList.add(new Square());
        shapeList.add(new Square());
        shapeList.add(new Diamond());
        shapeList.add(new Triangle());
        shapeList.add(new Shape());
        shapeList.add(new Square());
        shapeList.add(new Square());
        shapeList.add(new Diamond());
        shapeList.add(new Triangle());

        int  shapeCount =0;int triangleCount =0; int squareCount =0; int diamondCount =0;


        for(int i=0; i<shapeList.size(); i++) {
            if (shapeList.get(i) instanceof Square) {

                squareCount++;
            } else if (shapeList.get(i) instanceof Triangle) {

                triangleCount++;
            } else if (shapeList.get(i) instanceof Diamond){

                diamondCount++;
            }else{
                shapeCount++;
            }
        }
        System.out.println("shapeCount = "+shapeCount+"\ntriangleCount = "+triangleCount+"\nsquareCount = "+squareCount+
                "\ndiamondCount = "+diamondCount);
    }


    }

