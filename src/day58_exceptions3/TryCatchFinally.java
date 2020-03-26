package day58_exceptions3;
import java.net.MalformedURLException;
import java.net.URL;

public class TryCatchFinally {
    public static void main(String[] args) {

        System.out.println("Before TRY Catch Final");
        try {
                URL etsyURL = new URL("www.etsy.com"); //MalformedURLExceprion
        } catch (MalformedURLException e) {
                e.printStackTrace();
        } finally {
            System.out.println("Final block");
        }
        System.out.println("After Try Catch Final");


        try {
            int num = Integer.parseInt("123abc");
        } catch (NumberFormatException e){
            e.printStackTrace();
        }


    }
}
