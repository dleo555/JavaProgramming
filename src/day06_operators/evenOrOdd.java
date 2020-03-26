package day06_operators;
import java.util.Scanner;
public class evenOrOdd {
    public static void  main(String [] args){
    Scanner input = new Scanner (System.in);

//enter number
    System.out.println("Enter integer number");
    int number = input.nextInt();

//odd or even
        int remainder = number % 2;
    if (remainder < 1) // if 0
        System.out.println(number + " is even");

    if (remainder > 0.5) // if 1
        System.out.println(number + " is odd");

    }
}
