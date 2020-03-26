package day22_arrays_intro;

public class forEachLoop {
    public static void main (String [] args){
        int [] nums = {5, 6, 23, 10};
//for each loop (prints every number in the array)
        for (int n: nums){
            System.out.println(n);
        }
    }
}
