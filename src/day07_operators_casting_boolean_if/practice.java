package day07_operators_casting_boolean_if;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        //Enter your code here
        String firstName, lastName, fullName, email, street, state, city, address, contacts;
        int age, zipcode;
        double height, weight;
        boolean isMarried;
        long workPhoneNumber, personalPhoneNumber;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");

        System.out.println("Enter your first name");
        firstName = input.next();

        System.out.println("Enter your last name");
        lastName = input.next();

        input.nextLine();
        System.out.println("Enter your email");
        email = input.nextLine();

        System.out.println("Enter your street");
        street = input.nextLine();

        System.out.println("Enter your city");
        city = input.next();

        System.out.println("Enter your state");
        state = input.next();

        System.out.println("Enter your zip code");
        zipcode = input.nextInt();

        System.out.println("Enter your work phone number");
        workPhoneNumber = input.nextLong();

        System.out.println("Enter your personal phone number");
        personalPhoneNumber = input.nextLong();

        System.out.println("Enter your age");
        age = input.nextInt();

        System.out.println("Enter your height");
        height = input.nextDouble();

        System.out.println("Enter you weight");
        weight = input.nextDouble();

        System.out.println("Are you married?");
        isMarried = input.nextBoolean();

        contacts = "work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber;

        fullName = lastName + ", " + firstName;

        address = street + ", " + city + ", " + state + " " + zipcode;

        System.out.println("Patient personal information");
        System.out.println("Full name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Contacts: " + contacts + ", email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: "+ weight + " pounds");
        System.out.println("Married?: " + isMarried);
    }
}