package day12_ternary_string_manipulation;

public class FizzBuzz {
    public static void main(String[] args) {
        int num1 = 3;

        if (num1 %5 == 0 && num1 %3 == 0) {
            System.out.println("FizzBuzz");}
        else if (num1 % 5 == 0) {
                System.out.println("buzz");
        } else {
                System.out.println("fizz");
            }
}
}
