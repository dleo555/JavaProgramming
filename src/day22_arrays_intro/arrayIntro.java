package day22_arrays_intro;

import jdk.swing.interop.SwingInterOpUtils;

public class arrayIntro {
    public static void main (String[] args) {
        //declare int array with size 4
        int [] nums = new int[4];
        //assign values to each index to array
        nums [0] = 10;
        nums [1] = 5;
        nums [2] = 77;
        nums [3] = 111;
        System.out.println("Number at index 2 is " + nums[2]);
        System.out.println("Number at index 3 is " + nums[3]);
        int third = nums [3];
        System.out.println(third);
    }
}
