package day41_OOP;

public class CybertekBuilding {
    public static void main(String[] args) {
        Elevator elevator1 = new Elevator();//floor is 0 by default
        elevator1.goToFloor(3);
        System.out.println("-------------");
        elevator1.goToFloor(5);


    }
}
