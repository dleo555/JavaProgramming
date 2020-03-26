package day57_exceptions2;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileNotFoundDemo {
    public static void main(String[] args) {
        System.out.println("BEFORE");
        try {
            Files.readAllLines(Paths.get("file.txt"));
        }catch (IOException e){
            System.out.println("Exception happened anc caught!");
        }

        System.out.println("AFTER");
    }
}
