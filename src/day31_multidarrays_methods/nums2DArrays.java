package day31_multidarrays_methods;

import java.util.Arrays;

public class nums2DArrays {
    public static void main(String[] args) {
        int[][] nums2D = {
                {12, 55, 4, 7}, //automatically put 2 dimensional array
                {123, 555, 9},
                {56, 87, 455, 34},
                {234, 12, 54, 23, 23}};
        //------------------------------------------------------------------------------
        //Task1. print length of each array using array
        for (int i = 0; i < nums2D.length; i++) {
            int length = nums2D[i].length;
            System.out.println(length);
        }
        //Task2. print each array in separate line with no commas
        //for loop
        System.out.println("For loop");
        for (int i = 0; i < nums2D.length; i++) {
            for (int j = 0; j < nums2D[i].length; j++) {
                System.out.print(nums2D[i][j] + " ");

            }
            System.out.println();
        }
        //============================================================
        //for each loop
        System.out.println("For each loop");
        for (int[] nums1D : nums2D) {
            for (int num : nums1D) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        //Task3. Count sum of all numbers
        int sum = 0;
        for (int i = 0; i < nums2D.length; i++) {
            for (int j = 0; j < nums2D[i].length; j++) {
                sum += nums2D[i][j];
            }
        }
        System.out.println("Sum of all numbers: " + sum);

    }
}