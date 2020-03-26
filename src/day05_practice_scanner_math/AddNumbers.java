package day05_practice_scanner_math;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first #:");
        int firstNumber = input.nextInt();

        System.out.println("Enter second #:");
        int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("Sum is:" + sum);
    }
}
