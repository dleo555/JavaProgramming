package day11_string_comparison_logical;
import java.util.Scanner;
public class carShopping {
    public static void main(String[] args) {
        double budget = 35000;
        String carModel = "audi";
        double carPrice = 333333;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our Car Dealership!");
        System.out.println("Enter Model");
        carModel = input.next();
        System.out.println("Enter Price");
        carPrice = input.nextDouble();

        if (carModel.equalsIgnoreCase("Toyota")||carModel.equalsIgnoreCase( "BMW" )||
                carModel.equalsIgnoreCase( "Audi")|| carModel.equalsIgnoreCase( "Tesla")) {
                if (carPrice <= budget) {
            System.out.println("I like this car model!");
        }
        else
            System.out.println("Throw this car away!");
    }
}
}