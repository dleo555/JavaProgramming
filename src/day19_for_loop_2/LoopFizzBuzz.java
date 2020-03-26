package day19_for_loop_2;

public class LoopFizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " is FizzBuzz number");
            } else if (i % 3 == 0) {
                System.out.println(i + " is Fizz number");
            } else {
                System.out.println(i + " is Buzz number");
            }
        }
    }
}