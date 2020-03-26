package day38_methods_with_arrayList;
import java.util.*;
public class doubleTheList {
    public static void main(String[] args) {
        List<Integer> nums2 = new ArrayList<>();
        nums2.add(4); nums2.add(10); nums2.add(6);
        System.out.println("Before doubling: " + nums2.toString());

        doubleTheList(nums2);
        System.out.println("After doubling: " + nums2.toString());

        sumTheList(nums2);
        System.out.println("Sum is " + sumTheList(nums2));
    }

    public static void doubleTheList(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            int temp = nums.get(i);
            temp = temp * 2;
            nums.set(i, temp);
            //nums.set(i, nums.get(i) * 2); one line for above 3 lines
        }
    }

    public static int sumTheList (List<Integer> nums) {
        int sum = 0;
        for(int each : nums){
            sum += each;
        }
        return sum;
    }
    }
