package day18_for_loop;

public class printEvenOddNumbers {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // print even numbers
                System.out.print(i + " ");
            }
        }
            System.out.println();

            for (int b = 1; b <= 100; b++) {
                if (b % 2 != 0) { // print even numbers
                    System.out.print(b + " ");
                }
            }
        }
    }
