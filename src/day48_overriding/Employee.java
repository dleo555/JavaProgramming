package day48_overriding;

public class Employee {

    public void calculatePay (int hours, double rate) {
        System.out.println("Employee total pay: " + (hours*rate));
    }
}
