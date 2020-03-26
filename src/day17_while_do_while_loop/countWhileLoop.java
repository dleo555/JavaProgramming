package day17_while_do_while_loop;

public class countWhileLoop {
    public static void main(String[] args) throws Exception {
        int counter = 1;
        while (counter <= 10){
            System.out.print(counter + " ");
            ++counter;
            Thread.sleep(0);//pause/ slow down
        }
        System.out.println();
        int num = 10;
        while (num >=1){
            System.out.println(num);
            num--;
            Thread.sleep(0);
        }
    }
}
