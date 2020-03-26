package day59_exceptions4_collection1;
import java.util.*;
public class ThrowsKeyWord {
    public static void main(String[] args){
        try {
            sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleep(int seconds) throws InterruptedException{
        System.out.println("Sleeping for " + seconds + " seconds");
        Thread.sleep(seconds * 1000);


    }



}
