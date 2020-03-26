package day31_multidarrays_methods;
import java.util.*;
public class multiDimensionalArraysIntro {
    public static void main(String[] args) {
        /* multi dimensional array = is array inside array

         */
        String [] [] list = new String[4][3];
        list [0][0] = "Potatoes"; list [0][1] = "Carrots"; list [0][2] = "Onions"; //vegetables array
        list [1][0] = "Apples";   list [1][1] = "Kiwi";    list [1][2] = "Figs";   //fruits array
        list [2][0] = "Milk";     list [2][1] = "Eggs";    list [2][2] = "Cheese"; //diary array
        list [3][0] = "Bread";    list [3][1] = "Bagel";   list [3][2] = "Muffin"; //bread stuff array

        System.out.println(Arrays.toString(list[0]));
        System.out.println(Arrays.toString(list[1]));
        System.out.println(Arrays.toString(list[2]));
        System.out.println(Arrays.toString(list[3]));

        System.out.println(Arrays.deepToString(list));//print multi dimensional arrays

        String fruit = list[1][1];
        System.out.println("My favourite fruit is " + fruit);

        System.out.println(list.length);//4 (counts number of "rows")

        //print using loop
        for (int i = 0; i < list[0].length; i++) {
            System.out.println(list[0][i]);
        }
        //print all using for loops
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length ; j++) {
                System.out.println(list [i] [j]);
            }
        }
    }
}
