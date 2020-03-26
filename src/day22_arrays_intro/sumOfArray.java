package day22_arrays_intro;

public class sumOfArray {
    public static void main(String[] args) {
        int [] nums = {2, 4, 6, 8, 111};
        int totalPrice = 0;
for (int each : nums){
    totalPrice += each;
}
        System.out.println(totalPrice);
    }
}
