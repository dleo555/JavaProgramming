package day11_string_comparison_logical;
import java.util.*;
public class practice2 {
    public static void main(String[] args) {
        //ENTER CODE HERE
        int itemPrice;
        int quarters, dimes, nickels;
        int change;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter price in cents:");
        itemPrice = input.nextInt();
        if (itemPrice >=25 && itemPrice <=100 && itemPrice%5==0) {
            change = 100 - itemPrice;
            quarters = change / 25;
            change = change%25;
            dimes = change/10;
            change = change%10;
            nickels = change/5;
            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
        }
        else{
            System.out.println("Invalid price!");
        }
    }
}