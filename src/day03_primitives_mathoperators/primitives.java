package day03_primitives_mathoperators;

public class primitives {
    public static void main(String [] args){
        byte byteValue = 35;
        short shortValue = 20566;
        int intValue = 565464;
        long longValue = 565464564;
        float floatValue = 234.34F;
        double doubleValue = 4544.33;
        char charValue = 'A';
        boolean booleanValeu = true;
        long sum = 0;

        sum = byteValue + shortValue + intValue + longValue;

System.out.println(sum);

System.out.println("first: " +charValue);
System.out.println("Second: " +booleanValeu);

char second = 56;
// because of the char, it gives a defferent number. Look char table for more info
System.out.println("dsd: "+second);
    }
}
