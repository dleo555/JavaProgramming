package day37_arrayList;
import java.util.*;
public class RemoveInteger {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(2);
        nums.add(9);
        nums.add(3);
        nums.add(10);
        nums.add(11);
        nums.add(7);
        nums.add(7);

        System.out.println("Numbers count: " + nums.size()); //8
        System.out.println(nums);
        //[5, 2, 9, 3, 10, 11, 7, 7]

        nums.remove(0);
        System.out.println(nums);
        //[2, 9, 3, 10, 11, 7, 7]

        nums.remove(Integer.valueOf(2)); //remove number 2
        System.out.println(nums);
        //[9, 3, 10, 11, 7, 7]

        Integer n = Integer.valueOf(11);//create wrapper object
        nums.remove(n);//remove from array list number 11
        System.out.println(nums);
        //[9, 3, 10, 7, 7]



    }
}
