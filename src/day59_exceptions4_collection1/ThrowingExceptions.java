package day59_exceptions4_collection1;
import java.io.IOException;
import java.util.*;
public class ThrowingExceptions {
    public static void main(String[] args) {
        //create object of Arithmetic exception
        ArithmeticException ar = new ArithmeticException();
        Throwable ar2 = new ArithmeticException("Cannot / by 0");

        System.out.println(ar.getMessage());
        System.out.println(ar2.getMessage());

       // throw ar;

        String userName = "user12";
        if (userName.isEmpty()){
            //throw new RuntimeException("username cannot be empty"); you can use either or
            RuntimeException r = new RuntimeException("username cannot be empty");
            throw r;
        } else {
            System.out.println("username is valid");
        }

        int age = 20;
        if (age < 18) {
            throw new IllegalArgumentException("not-eligible to vote");
        } else {
            System.out.println("eligible to vote");
        }


        int [] nums = {44, 55, 11};
        int index = 1;

        if (index <0 || index > nums.length){
            throw new ArrayIndexOutOfBoundsException("invalid index " + index);
        } else {
            System.out.println("index " + index + " value is " + nums[index]);
        }


        try {
            throw new IOException();
        } catch (Exception e){

        }
    }
}
