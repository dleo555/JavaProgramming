package day12_ternary_string_manipulation;
import  java.util.Scanner;
public class cafeNestedIf {
    public static void main(String[] args) {
        String drink = ""; //soda 1.99, coffee 4.99, water 1.55
        String food = ""; //sandwich 7.45, soup 6.33, salad 9.99
        double drinkPrice = 0;
        double foodPrice = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("What would you like to drink?");
        drink = input.nextLine();
        System.out.println("What would you like to eat?");
        food = input.nextLine();

        if (drink.equals("soda")) {
            drinkPrice = 1.99;
        } else if (drink.equals("coffee")) {
            drinkPrice = 4.99;
        } else if (drink.equals("water")) {
            drinkPrice = 1.55;
        } else {
            drinkPrice = 0;
            System.out.println("We don't serve this drink, Sorry!");
    }
        System.out.println("Drink Price is $" + drinkPrice);

        if (food.equals("sandwich")) {
            foodPrice = 7.45;
        } else if (food.equals("soup")) {
            foodPrice = 6.33;
        } else if (food.equals("salad")) {
            foodPrice = 9.99;
        } else {
            System.out.println("We don't serve this drink, Sorry!");
        }
        System.out.println("Food Price is $" + foodPrice);
        System.out.println("----------------------");

        double totalPrice = drinkPrice + foodPrice;
        System.out.println("Total price is $" +totalPrice);
    }
}