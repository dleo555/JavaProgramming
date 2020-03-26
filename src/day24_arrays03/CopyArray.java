package day24_arrays03;

public class CopyArray {
    public static void main(String[] args) {
        int [] nums1 = {23, 43, 54, 13};
        int [] nums2 = new int[nums1.length];

        System.out.println("nums1 length: " + nums1.length);
        System.out.println("nums2 length: " + nums2.length);

        //using for loop, read all values from num1 and assign to num2
        for (int idx =0; idx < nums1.length; idx++){
            nums2 [idx] = nums1 [idx];
        }

        //print values for nums1 and nums2
        for (int num : nums1){
            System.out.println(num + "");
        }
        for (int num : nums2) {
            System.out.println(num + "");
        }

        //declare num3 with same size as num1
        int[] nums3 = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            nums3[i] = nums1[i] * 2;
        }
        System.out.println();
        for(int n : nums3) {
            System.out.print(n +" ");
        }
    }
}
