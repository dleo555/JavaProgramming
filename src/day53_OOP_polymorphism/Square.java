package day53_OOP_polymorphism;

public class Square extends Shape {
    public Square () {
        type = "square";
    }

    @Override
    public void draw(){
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <6 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
