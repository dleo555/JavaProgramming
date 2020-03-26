package day41_OOP;

public class Elevator {
    private int currentFloor;
    public void goToFloor(int newFloor) {
        if (newFloor >= 0 && newFloor <= 6) {
            if (newFloor > currentFloor) {
                for (int i = currentFloor; i < newFloor; i++) {
                    System.out.println("going to floor " + (i + 1));
                }
            } else if (newFloor < currentFloor) {
                for (int i = currentFloor; i > newFloor; i--) {
                    System.out.println("going to floor " + (i - 1));
                }
            } else if (newFloor == currentFloor) {
                System.out.println("You are already in floor " + newFloor);
            } else {
                System.out.println("Invalid floor number");
            }
        }
    }
}