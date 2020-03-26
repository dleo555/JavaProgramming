package day35_wrapper_classes_and_methods;
import java.util.*;
public class WrapperClasses {
    public static void main(String[] args) {
        Integer num = new Integer(10);
        Integer num2 = 33;
        System.out.println(num);
        System.out.println(num2);

        num.toString();
        System.out.println(Integer.sum(4, 6));
        System.out.println(Integer.max(4, 5));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        //convert STRING to INT
        String countStr = "3456";
        int intCount = Integer.parseInt(countStr);
    }
}