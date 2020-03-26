package day28_review;
import java.util.*;
public class fillArrayLoop {
    public static void main(String[] args) {
        int [] nums = new int [101];//declare int array with size 101
        System.out.println(nums[0]);//0 - by default all 0s
        for (int i = 0; i < 101; i++) {
            nums[i] = i; //assigning numbers to the arrays
        }
        System.out.print(Arrays.toString(nums)); //print array in one line
        System.out.println(); //add empty line
        for (int i = nums[100]; i >=0 ; i--) {
            System.out.print(nums[i] + ", ");
        }
    }
}
