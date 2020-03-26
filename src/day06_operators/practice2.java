package day06_operators;
import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {

        //WRITE YOUR CODE HERE:
        Scanner input = new Scanner(System.in);
        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;
        Scanner scan = new Scanner (System.in);

        System.out.println("\"Enter Item1 and its price:\"");
        item1 = scan.next();
        price1 = scan.nextDouble();

        System.out.println("\"Enter Item2 and its price:\"");
        item2 = scan.next();
        price2 = scan.nextDouble();

        System.out.println("\"Enter Item3 and its price:\"");
        item3 = scan.next();
        price3 = scan.nextDouble();

        totalPrice = price1 + price2 + price3;

        System.out.print("\"Item1: " + item1 + ": " + price1);
        System.out.print(", Item2: " + item2 + ": " + price2);
        System.out.print(", Item3: " + item3 + ": " + price3 + "\"");
        System.out.println("\"Total price: " + totalPrice);

    }
}