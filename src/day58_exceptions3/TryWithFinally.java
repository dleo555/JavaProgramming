package day58_exceptions3;

public class TryWithFinally {
    public static void main(String[] args) {
        try {
            System.out.println("In try block...");
            System.out.println(9/0);
        } finally {
            System.out.println("In finally block...");
        }





    }
}
