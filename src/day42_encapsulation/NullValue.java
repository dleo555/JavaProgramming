package day42_encapsulation;

public class NullValue {
    public static void main(String[] args) {
     //primitives cannot be nulls
        String myString = null;
        System.out.println(myString);
        //System.out.println(myString.length()); //java.lang.NullPointerException
        //NULL doesn't point to any place in memory (HEAP)


    }
}
