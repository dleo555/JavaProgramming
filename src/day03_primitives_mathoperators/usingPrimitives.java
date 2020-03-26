package day03_primitives_mathoperators;

public class usingPrimitives {
    public static void main(String [] args){
        int y, yy, yyy;
        y = 100;
        yy = y;
        yyy = yy;

        System.out.println(y);//100
        System.out.println(yy);//100
        System.out.println(yyy);//100

        System.out.println(y+yy+yyy);

        y=222;
        //what if we change one value
int n, nn, nnn;
n = nn = nnn = 200;
System.out.println(n);

System.out.println(y+yy+yyy); //422
    }
}
