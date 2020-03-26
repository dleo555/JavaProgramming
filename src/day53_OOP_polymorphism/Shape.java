package day53_OOP_polymorphism;

public class Shape {
    public String type;
    public Shape () {
        type = "shape";
    }
    public void draw () {
        System.out.println("shape: * * * * * * *");
    }
}
