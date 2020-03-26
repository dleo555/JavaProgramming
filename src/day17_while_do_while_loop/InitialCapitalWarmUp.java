package day17_while_do_while_loop;

public class InitialCapitalWarmUp {
    public static void main(String[] args) {
        String word = "java"; word.toLowerCase();
        String chr = word.substring(0,1);
        String chr1 = chr.toUpperCase();
        System.out.println(chr1 + word.substring(1));

        //===============================
        String word2 = "javalanII";
        String inCap = word2.substring(0,1).toUpperCase() + word2.substring(1).toLowerCase();
        System.out.println(inCap);
    }
}
