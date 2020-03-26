package day58_exceptions3;
import java.util.*;
public class TryCatchNoOtherOption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("enter number");
            int n = scan.nextInt();
            System.out.println("n = " + n);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, only number are allowed!");
            System.out.println("Try again");
        }





    }
}
