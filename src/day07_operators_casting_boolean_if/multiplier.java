package day07_operators_casting_boolean_if;
import java.util.Scanner;
public class multiplier {
    public static void main(String[] args) {
        System.out.println("Welcome to Multiplier!");
        System.out.println("Enter 2 numbers");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int result = firstNumber*secondNumber;
        System.out.println("Result: " + result);
    }
}
