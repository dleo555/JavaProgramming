package day56_exceptions;

public class tryCatch {
    public static void main(String[] args) {
        System.out.println("Before try catch");
        try {
            System.out.println("in try block");
            int result = 10 / 0;
            System.out.println("after 10/0"); //WON"T PRINT
        } catch (ArithmeticException e){
            System.out.println("Exception happened, and was handled!");
        }



        System.out.println("After try catch");



    }
}
