package day60_collections2;
import java.util.*;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> nums1 = new Vector<>();
        List<Integer> nums2 = new Vector<>();

        nums2.add(55);
        nums2.add(35);

        System.out.println(nums2.toString());
        System.out.println(nums2.get(0));
        System.out.println(nums2.size());


    }
}
