package day32_custom_methods;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayMessage("Java is fun!");
        count(5);
    }

    public static void displayMessage(String message) {
        System.out.println("Message " + message);

    }

    public static void count(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
    }



}
