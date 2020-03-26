package day08_if_statement;

public class CheckPinCode {
    public static void main(String[] args) {
int secretPin = 1234;
int inputCode = 12345;
        System.out.println("Welcome!");
if (secretPin == inputCode)
    System.out.println("You can withdraw!");
else
    System.out.println("Wrong! Go away!");

}
    }

