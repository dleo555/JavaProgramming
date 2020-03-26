package day21_for_loop_3;

public class warmUp {
    public static void main(String[] args) {
        String str = "java, github username, javajava, python, automation java tools, java is most popular";
    int idx =0;
        System.out.println(str.substring(idx, idx+2));//ja
        idx++;
        System.out.println(str.substring(idx, idx+2));//av
        idx =0;
        System.out.println(str.substring(idx, idx+4));//java

        //printing everything using for loop
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(i, i+1));

        }


    }
}
