package day36_wrapper_arraylist;

public class convertStringToPrimitive {
    public static void main(String[] args) {

        boolean b1 = Boolean.parseBoolean("true");

        char ch = Character.valueOf((char)'c');

        byte byteValue = Byte.parseByte("100");

        short shortValue = Short.parseShort("10000");

        int intValue = Integer.parseInt("345678");

        long longValue = Long.parseLong("65768795332422");

        float floatValue = Float.parseFloat("3456.55");

        double doubleValue = Double.parseDouble("123456.78");

        String strPrice = "234.5";
        double doublePrice = Double.parseDouble(strPrice);

        System.out.println(doublePrice + 1); //+1 proves that we converted String to double



    }
}
