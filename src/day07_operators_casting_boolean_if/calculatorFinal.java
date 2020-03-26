package day07_operators_casting_boolean_if;
import java.util.Scanner;
public class calculatorFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declare all variables
        float firstNumber = 0;
        float secondNumber = 0;
        float sum = 0;
        float min = 0;
        float mult = 0;
        float div = 0;
        float sqr = 0;
        int operator = 0;
        float exponent = 0;
        float sqrSum = 0;

        //user enters 2 integers and 1 operator
        System.out.println("Enter number A: ");
        firstNumber = input.nextFloat();
        System.out.println("Enter number B: ");
        secondNumber = input.nextFloat();
        System.out.println("Enter operator: ( 0 for +, 1 for -, 2 for *, 3 for /, 4 for (sum)^x)");
        operator = input.nextInt();

        //program suppose to do 1 of 5 main math calculations by user's choice.
        System.out.println("RESULT:");
        sum = firstNumber + secondNumber;
        if (operator == 0) //+
            System.out.println(firstNumber + " + " + secondNumber + " = " +sum);
        min = firstNumber - secondNumber;
        if (operator == 1) //-
            System.out.println(firstNumber + " - " + secondNumber + " = " +min);
        mult = firstNumber*secondNumber;
        if (operator == 2) //*
            System.out.println(firstNumber + " x " + secondNumber + " = " +mult);
        div = firstNumber/secondNumber;
        if (operator == 3) ///
            System.out.println(firstNumber + " / " + secondNumber + " = " +div);


        //Google SQRT function in java

        if (operator == 4) //^
            System.out.println("Enter the exponent for FINAL RESULT. (Ex: 2, 7, etc.)");
        exponent = input.nextInt();
        sqrSum =(firstNumber + secondNumber);
        sqr = sqrSum*sqrSum;
        System.out.println("FINAL RESULT:");
        System.out.println("(" + firstNumber + " + " + secondNumber + ")^" + exponent + " = " +sqr);
    }
}
