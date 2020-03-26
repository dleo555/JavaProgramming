package day12_ternary_string_manipulation;
import java.util.Scanner;
public class capitalCity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String capital;
        System.out.println("Enter capital city of Turkey!");
        capital = input.next();

        if (capital.equalsIgnoreCase("Ankara")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! Try again!");
        }
    }


}
