package day36_wrapper_arraylist;
import java.util.*;
public class ArrayListIntro { //array list is dynamic array
    public static void main(String[] args) {
        //declare array list
        ArrayList myFirstList = new ArrayList ();
        //assign values using add methods
        myFirstList.add("java");
        myFirstList.add("javascript");
        myFirstList.add("python");
        myFirstList.add("repl.it");
        myFirstList.add(1200);//we can include different data types because we didn't state array type
        myFirstList.add(34.5);
        myFirstList.add(true);
        //print array list
        System.out.println(myFirstList);
        //-----------------------------------------------------------------------------------------
        //Declare array list with a specific data type
        ArrayList<Integer> numsList = new ArrayList<>();
        numsList.add(10);
        numsList.add(23);
        //numsList.add("ADD");//error
        System.out.println(numsList.toString());




    }
}
