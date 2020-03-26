package day24_arrays03;

import java.util.Arrays;

public class ArraysUtil {
    public static void main(String[] args) {
        double [] nums = {34.2, 10.4, 100.0, 1.2, 0.4, 89.5};
        System.out.println(Arrays.toString(nums));

        String [] fruit = {"mango", "apples", "kiwi"};
        System.out.println(Arrays.toString(fruit));
        System.out.println(fruit[0]);//mango

        //char arrays, and assign your name to the arrays
        char [] myName = {'D', 'a', 'n', 'i', 'c', 'h'};
        System.out.println(Arrays.toString(myName));
        //assign week days and print upper case
        String [] days = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sut", "Sun"};
        System.out.println(Arrays.toString(days).toUpperCase());
    }
}
