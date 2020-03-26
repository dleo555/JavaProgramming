package day06_operators;
import java.util.Scanner;
public class tempConverter {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Fahrenheit: ");
        double fNumber = input.nextDouble();
        double cNumber = (fNumber - 32)*5/9;
        System.out.println("Celsius: " + cNumber);
        System.out.println();
        System.out.println("Enter Celsius: ");
        double celNumber = input.nextDouble();
        double farNumber = (celNumber*9/5)+32;
        System.out.println("Fahrenheit: " + farNumber);
    }
//(F-32) *5/9 = C
}
