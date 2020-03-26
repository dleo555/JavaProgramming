package day53_OOP_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollection{
    public static void main(String[] args) {
        //declare array that can store 2 squares

       Shape [] squaresArr = new Shape [4];

        squaresArr [0] = new Square();
        squaresArr [1] = new Triangle();
        squaresArr [2] = new Diamond();

        List<Shape> squareList = new ArrayList<>();
        squareList.add(new Shape());
        squareList.add(new Square());
        squareList.add(new Triangle());
        squareList.add(new Diamond());

        for (int i = 0; i < squareList.size(); i++) {
            squareList.get(i).draw();
        }



    }
}
