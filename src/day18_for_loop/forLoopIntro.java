package day18_for_loop;

public class forLoopIntro {
    public static void main(String[] args) {
        /* while loop:
        --> repeats block of code as long as boolean condition is true
        > use this loop when you are not sure how many times the loop will execute
        ex: keep looping until user enters even number

        do while loop:
        --> runs the loop block code once then checks the boolean condition, it will keep repeating
        the block of code as long as boolean condition is true
        > use this loop when your code should run at least once
        ex: games, when user needs to do some action first
        **** NOT so popular in automation ****

        for loop:
        --> repeats the block of code as long as boolean condition is true.
        > use when we know the iteration count
        ex: repeat something 100 times
        **** More convenient to use, more popular ******
         */

        //let's compare while and for loops

        int n = 1;
        while (n <= 5) {
            System.out.print(n);
            n++;
        }
//===================================================
        for (int b = 1; b <= 5; b++) {
            System.out.print(b);
        }
    /* for (int b = 1 (initialization); b <= 5 (boolean condition); b++ (updating/incrementing))
FORI IS A SHOTCUT
     */
       // for (; ; ) { //infinite loop
          //  System.out.println("Java is fun");
        //}
        for (int v = 1; v <= 3; v++){
            System.out.println("Hello Friends");
        }

    }
}
