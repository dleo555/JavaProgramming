package day06_operators;
import java.util.Scanner;
public class redoCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declare all variables
        double firstNumber = 0;
        double secondNumber = 0;
        double sum = 0;
        double min = 0;
        double mult = 0;
        double div = 0;
        double sqr = 0;
        int operator = 0;

        //user enters 2 integers and 1 operator
        System.out.println("Enter first number: ");
        firstNumber = input.nextDouble();
        System.out.println("Enter second number: ");
        secondNumber = input.nextDouble();
        System.out.println("Enter operator: ( 0 for +, 1 for -, 2 for *, 3 for /, 4 for ^)");
        operator = input.nextInt();

        //program suppose to do 1 of 5 main math calculations by user's choice.
        sum = firstNumber + secondNumber;
            if (operator == 0) //+
                System.out.println("Sum \"+\" = "+sum);
        min = firstNumber - secondNumber;
            if (operator == 1) //-
                System.out.println("Min \"-\"= "+min);
        mult = firstNumber*secondNumber;
            if (operator == 2) //*
                System.out.println("Mult \"*\"= "+mult);
        div = firstNumber/secondNumber;
            if (operator == 3) ///
                System.out.println("Div \"/\"= "+div);
        sqr = (firstNumber+secondNumber)*(firstNumber+secondNumber);
            if (operator == 4) //^
                System.out.println("Sqr \"^\"= "+sqr);
    }
}
