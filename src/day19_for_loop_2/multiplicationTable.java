package day19_for_loop_2;
import java.util.*;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result = 0;

        if (num < 1 && num > 10) {
            System.out.println("ERROR");
            return;
        } else if (num >= 1 && num <= 10) {
            for (int i = 1; i <= 12; i++) {
                result = num * i;
                System.out.println(num + " X " + i + " = " + result);
            }
        }
       // how to print the whole multiplication table++++++++++++++++++====+
        for (int a = 1; a <= 10; a++) {
            for (int j = 1; j <= 10; j++) {
                int ij = a * j;
                System.out.println(a + " * " + j + " = " + ij + "  ");
            }
        }
    }
}
