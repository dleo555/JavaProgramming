package day07_operators_casting_boolean_if;

public class typeCasting {
    public static void main(String[] args) {
        //automatic casting -> implicit casting
        //from small to large
        byte b=100;
        short sh=b;
        int i=sh;
        System.out.println("b: " +b);
        System.out.println("sh: " +sh);
        System.out.println("i: " +i);

        int n=1234567;
        long l=n;
        System.out.println("n: " +n);
        System.out.println("l: " +l);

        double d =n;//adds a .0 decimal
        System.out.println("d: " +d);

        int n2=120;
        byte b2= (byte)n2;//convert into byte
        System.out.println("n2: " +n2);
        System.out.println("b2: " +b2);

        double price = 130.44;
        int intprice = (int)price;
        System.out.println("price: " +price);
        System.out.println("intPrice: " + intprice);

        int num3 = 1000;
        byte b3 = (byte)num3;
        System.out.println("num3: " +num3);
        System.out.println("b3: " +b3);

        int num5 = 3456;
        String str = num5+" ";
        System.out.println("str: " +str); // becomes a text
    }
}
