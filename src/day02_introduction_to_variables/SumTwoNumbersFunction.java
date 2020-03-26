package day02_introduction_to_variables;

import java.util.Scanner;
// creating a calculator with only a sum function of integer number
public class SumTwoNumbersFunction {
    public static void main(String [] args){
    Scanner input=new Scanner(System.in);
    int firstNumber=0;
    int secondNumber=0;
    int sum=0;

    System.out.println("Enter first number: ");
    firstNumber = input.nextInt ();
    System.out.println("Enter second number: ");
    secondNumber = input.nextInt ();

    sum = firstNumber+secondNumber;
    System.out.println("Sum is: "+sum);
    }
}
