package day35_wrapper_classes_and_methods;
import java.util.*;
public class MethodsWithArrayReturn {

    public static void main(String[] args) {
       // System.out.println(getDays());//HashCode
        System.out.println(Arrays.toString(getDays()));//[Mon, Tue, Wed, Thur, Fri, Sat, Sun]
    }

    public static String [] getDays () {
        String [] days = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};
        return days;
    }
}