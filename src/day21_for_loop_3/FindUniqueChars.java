package day21_for_loop_3;
import java.util.*;
public class FindUniqueChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String unique = "";

        //loop from beginning until end of str
        for (int n=0; n < str.length(); n++){
            String temp = str.charAt(n) + "";
            System.out.println("temp = " + temp);

            //check if temp is in unique, if not then add to it
            if (!unique.contains(temp)){
                unique = unique + temp;//unique +=temp
            }
        }
        System.out.println("unique = " + unique);
    }
}
