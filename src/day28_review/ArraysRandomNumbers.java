package day28_review;
import java.lang.reflect.Array;
import java.util.*;
public class ArraysRandomNumbers {
    public static void main(String[] args) {
        //create random object
        Random rd = new Random();
        //how to generate 0 to 100 number using random
        System.out.println(rd.nextInt(101)); // put 101 for a range from 0 to 100
        //create an array with 10 variables, and randomly assign integers from 0 to 100
        int [] nums = new int[10];
        for (int i = 0; i < 10; i++) {
        nums [i] = rd.nextInt(101);
        }
        //print the whole array in one line
        System.out.println(Arrays.toString(nums));
    }
}
