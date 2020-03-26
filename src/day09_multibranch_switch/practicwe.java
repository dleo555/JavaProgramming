package day09_multibranch_switch;
import java.util.Scanner;
public class practicwe {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");
        String item1 =scan.next();
        //  double price1 = scan.nextDouble();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();
        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        //  double price2 = scan.nextDouble();
        int count2  = scan.nextInt();
        double price2 = scan.nextDouble();
        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();
        //  int count3 = scan.nextInt();

        if(count1==0){
            double item2Price = count2*price2;
            double item3Price = count3*price3;
            double report = (count2*price2)+(count3*price3);
            System.out.println("Item2: "+item2+" Price: "+item2Price+", Item3: "+item3+" Price: "+item3Price);
            System.out.println("Total price: "+ report);
        }else if(count2==0){
            double item1Price = count1*price1;
            double item3Price = count3*price3;
            double report = (count1*price1)+(count3*price3);
            System.out.println("Item1: "+item1+" Price: "+item1Price+", Item3: "+item3+" Price: "+item3Price);
            System.out.println("Total price: "+ report);
        }else if(count3==0){
            double item1Price = count1*price1;
            double item2Price = count2*price2;
            double report = (count1*price1)+(count2*price2);
            System.out.println("Item1: "+item1+" Price: "+item1Price+", Item2: "+item2+" Price: "+item2Price);
            System.out.println("Total price: "+ report);
        }
    }
}