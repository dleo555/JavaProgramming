package day07_operators_casting_boolean_if;
import java.util.Scanner;
public class warmUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName, lastName, companyName;

        System.out.println("Welcome to our Company!");
        System.out.println("Enter first name, last name, company name!");
        firstName = input.next();
        lastName = input.next();
        companyName = input.next(); //accepts company in 1 word

        String email = firstName + "_" + lastName + "@" + companyName + ".com";
        System.out.println("Your email: " + email);

    }
}
