package day17_while_do_while_loop;

public class monkeys {
    public static void main(String[] args) throws Exception{
        int monkey = 5;
        while (monkey >=1){
            if (monkey ==1) {
                System.out.println(monkey + " little monkey jumping on the bed,");
            } else {
                System.out.println(monkey + " little monkeys jumping on the bed,");
            }
            System.out.println("One fell down and bumped his head,");
            System.out.println("Mama called the doctor and the doctor said,");
            System.out.println("No more monkeys jumping on the bed!");
            System.out.println();
           monkey--;
           Thread.sleep(1000);
        }
        System.out.println("Put those monkeys right to bed");
    }
}
