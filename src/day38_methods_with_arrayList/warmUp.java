package day38_methods_with_arrayList;
import java.util.*;
public class warmUp {
    public static void main(String[] args) {

    List <Integer> nums = new ArrayList<>();
    nums.add(5); nums.add(15); nums.add(52); nums.add(25); nums.add(55);
    nums.add(53); nums.add(5); nums.add(501); nums.add(57); nums.add(85);

    printList(nums);
    }

    public static void printList(List <Integer> list) {
        for (Integer iEach :  list ){
            System.out.println(iEach + " ");//print each num from array
        }
        System.out.println();// go to new line
    }
}
