package day35_wrapper_classes_and_methods;
import java.util.*;
public class methodsWithArray {
    public static void main(String[] args) {
        int[] myNums = {3, 1, 4, 55, 6, 9, 3};
        printArray(myNums);
        System.out.println(has10(myNums));
        System.out.println(longerThan3(myNums));
    }

    public static void printArray(int[] nums) {
        for (int eachNum : nums) {
            System.out.println(eachNum);
        }
    }

    public static boolean has10(int[] nums) {
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 10) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static boolean longerThan3 (int [] nums) {
        boolean length = false;
        if (nums.length > 3) {
            length = true;
        }

        return length;
    }
}