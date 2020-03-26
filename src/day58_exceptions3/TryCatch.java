package day58_exceptions3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatch {
    public static void main(String[] args) {
        //unhandled exception: java.io.FileNotFoundException
        try {
            FileReader fr = new FileReader("file.csv");
        } catch (FileNotFoundException e){
            System.out.println("some message");
            e.printStackTrace();
        }
        System.out.println("after TRY CATCH");





    }
}
