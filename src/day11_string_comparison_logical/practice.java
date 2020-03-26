package day11_string_comparison_logical;
import java.util.*;
public class practice{
        public static void main(String[] args) {
            //Write your code here
            Scanner input = new Scanner(System.in);
            int number;
            int gumballs;
            int candies;
            System.out.println("Enter number of coupons:");
            number = input.nextInt();

            if (number >= 10) {
                candies = number / 10;
                gumballs = number % 10;
                System.out.println("Number of Candies: " + candies);
                System.out.println("Number of Gumballs: " + gumballs);
            }
            else if (number < 10) {
                System.out.println("Not enough coupons");
            }
        }
    }