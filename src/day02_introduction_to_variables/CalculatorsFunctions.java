package day02_introduction_to_variables;
import java.util.Scanner;
public class CalculatorsFunctions {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        double firstNumber=0;
        double secondNumber=0;
        double sum=0;
        //user enters 2 integers to do calculation
        System.out.println("Enter first number: ");
        firstNumber = input.nextDouble ();
        System.out.println("Enter second number: ");
        secondNumber = input.nextDouble ();
        //program suppose to do 4 main math calculations with two integers user provides
        System.out.println("Types of operator: Result");
        sum = firstNumber+secondNumber;
        System.out.println("Addition:           "+sum);
        sum = firstNumber-secondNumber;
        System.out.println("Substraction:       "+sum);
        sum = firstNumber*secondNumber;
        System.out.println("Multiplication:     "+sum);
        sum = firstNumber/secondNumber;
        System.out.println("Division:           "+sum);
        sum = (firstNumber+secondNumber)*(firstNumber+secondNumber);
        System.out.println("(a+b)^2:            "+sum);
        }
    }
