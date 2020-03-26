package day36_wrapper_arraylist;
import java.util.*;
public class ArrayListWriteRead {
    public static void main(String[] args) {

        //declare array list that can store Integers values, nums
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(10);
        nums.add(20);
        nums.add(21);
        nums.add(-7);
        System.out.println("Numbers of values is " + nums.size());//5
        System.out.println("All values are " + nums.toString());//[10, 10, 20, 21, -7]
        System.out.println(nums.get(0));//10
        System.out.println(nums.get(2));//20

        for (int i = 0; i < nums.size() ; i++) {
            System.out.print(nums.get(i) + " ");
        }

    }
}
