package day24_arrays03;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int [] nums = {45, 66, 22, 99, 2};
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(nums));

        // how sort works with string
        String [] str = {"CyberTek", "Capital One", "FreddieMac", "Apple"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

    }
}
