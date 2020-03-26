package day48_overriding;

public class Contructor extends Employee {
    public void calculatePay (int hours, double rate) {
        System.out.println("Contractor Employee total pay: " + ((hours*rate) + (200)));
    }
}
