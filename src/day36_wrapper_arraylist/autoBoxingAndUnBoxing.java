package day36_wrapper_arraylist;

public class autoBoxingAndUnBoxing {
    public static void main(String[] args) {
        //AutoBoxing: Primitive > Wrapper Class Object
        Integer n1 = 1000;
        //or
        int n = 345;
        Integer n2 = n;

        //Unboxing: Wrapper class object > Primitive
        Integer n3 = Integer.valueOf(55);
        int num1 = n3;

        //print values
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("num1 = " + num1);



    }
}
