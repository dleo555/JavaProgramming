package day05_practice_scanner_math;
import java.util.Scanner;
public class scannerSpeedCheck {
    //scanner allows user to enter values from keyboard.
    public static void main(String [] args){
        int speedLimit = 55;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Speed Check!");
        //enter a number
        System.out.println("Enter your speed: ");
        int currentSpeed = input.nextInt();

        int speedOverLimit = currentSpeed - speedLimit;
        System.out.println("You are over a speed limit by "+ speedOverLimit + " mph. Slow down!");
    }
}
