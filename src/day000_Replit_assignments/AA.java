package day000_Replit_assignments;
import java.util.*;
public class AA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        //WRITE YOUR CODE HERE
        int appearances = 0;

        for (int i = n; i < str.length()+1; i++) {
            if (str.substring(i-n, i).equals(str.substring(0, n))){
                appearances++;
            }
        }

        if (appearances ==2){
            System.out.println("true");
                System.out.println(str.substring(0, n) + " appears twice");

        } else if (appearances ==1) {
            System.out.println("false");
            System.out.println(str.substring(0, n) +" appears once only");
        }
    }
}