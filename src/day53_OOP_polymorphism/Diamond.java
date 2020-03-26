package day53_OOP_polymorphism;

public class Diamond extends Shape {
    public Diamond() {
        type = "diamond";
    }

    public void draw() {
        for (int i = 5; i > -5; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.println("*");

        }
    }
}
