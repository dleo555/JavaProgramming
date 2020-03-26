package day57_exceptions2;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("BEFORE");

        try {
            System.out.println("Hello from try block");
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("Hello from catch block, and exception happened");
        }

        System.out.println("AFTER");


        System.out.println("------------------------------------------------------");


        System.out.println("BEFORE");
        try {
            System.out.println("Hello from try block");
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("Hello from catch block, and exception happened");
        } finally {
            System.out.println("hello from finally block");
        }


        System.out.println("AFTER");
    }
}
