package day17_while_do_while_loop;
import java.util.*;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100);
        int guessNumber;
        int attempts = 5;

        do {
            System.out.println("Guess the Secret Number, you have " + attempts + " attempts");
            guessNumber = input.nextInt();
            attempts--;

            if (guessNumber > secretNumber) {
                System.out.println("The secret number is smaller");
            } else if (guessNumber < secretNumber) {
                System.out.println("The secret number is bigger");
            }
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        }while (guessNumber != secretNumber && attempts > 0);

        if (attempts >= 0 && guessNumber == secretNumber) {
                System.out.println("Congratulations! Your guess is correct");
        } else if (attempts == 0 && guessNumber != secretNumber) {
                System.out.println("You lost! HA-HA-HA-HA-HA");
        }
    }
}