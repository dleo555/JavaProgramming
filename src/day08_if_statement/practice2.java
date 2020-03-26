package day08_if_statement;
import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:

        //declaring variables
        Scanner scan = new Scanner(System.in);
        String item1, item2, item3;
        String report = "0";
        double price1, price2, price3, totalPrice;
        int count1, count2, count3;

        //enter info
        System.out.println("Enter Item1, count and its price");
        item1 = scan.nextLine();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter Item2, count and its price");
        item2 = scan.nextLine();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter Item3, count and its price");
        item3 = scan.nextLine();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();

        //summary exclude 0 counts or negatives
        if (count1 > 0 && count2 > 0 && count3 > 0) { // all true
            report = ("Item1: " + item1 + ": " + price1 * count1 + ", " + "Item2: " + item2 + ": " + price2 * count2 + ", " + "Item3: " + item3 + ": " + price3 * count3);
            System.out.println(report);
        } else if (count1 <= 0 && count2 > 0 && count3 > 0) { //1 false
            report = ("Item2: " + item2 + ": " + price2 * count2 + ", " + "Item3: " + item3 + ": " + price3 * count3);
            System.out.println(report);
        } else if (count1 > 0 && count2 <= 0 && count3 > 0) { //2 false
            report = ("Item1: " + item1 + ": " + price1 * count1 + ", " + "Item3: " + item3 + ": " + price3 * count3);
            System.out.println(report);
        } else if (count1 > 0 && count2 > 0 && count3 <= 0) { //3 false
            report = ("Item1: " + item1 + ": " + price1 * count1 + ", " + "Item2: " + item2 + ": " + price2 * count2);
        System.out.println(report);
        }else if (count1 <= 0 && count2 <= 0 && count3 <= 0) { // 1 and 2 false
            report = ("Item3: " + item3 + ": " + price3 * count3);
            System.out.println(report);
        }else if (count1 > 0 && count2 <= 0 && count3 <= 0) { // 2 and 3 false
            report = ("Item1: " + item1 + ": " + price1 * count1);
            System.out.println(report);
        }else if (count1 <= 0 && count2 > 0 && count3 <= 0) {// 1 and 3 false
            report = ("Item2: " + item2 + ": " + price2 * count2);
            System.out.println(report);
        }
        //total price exclude 0 counts or negatives
        totalPrice = (price1*count1 + price2*count2 + price3*count3);
        System.out.println("Total price: " +totalPrice);
    }
}