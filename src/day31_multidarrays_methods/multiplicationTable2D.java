package day31_multidarrays_methods;
import java.util.*;
public class multiplicationTable2D {
    public static void main(String[] args) {
        int[][] table = new int[10][10];
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= 10; inner++) {
               table [outer-1] [inner-1] = outer * inner;
                System.out.print(outer * inner + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(table));

    }
}