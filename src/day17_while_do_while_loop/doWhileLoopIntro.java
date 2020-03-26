package day17_while_do_while_loop;
import java.util.*;
public class doWhileLoopIntro {
    public static void main(String[] args) throws Exception {
        // do while is for a case when you need to execute a loop AT LEAST ONCE no matter what.
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        do {
            System.out.print(i + " ");
            i = i + 2;
            Thread.sleep(250);
        } while (i <= 15);
    }
}