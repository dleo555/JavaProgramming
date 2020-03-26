package day17_while_do_while_loop;

public class aphabet {
    public static void main(String[] args) throws Exception{
        char letter = 'A';
        while ( letter <= 'Z'){
            System.out.print(letter + " ");
            letter++;
            Thread.sleep(0);
        }
        System.out.println();//=============================================
        char lLetter = 'a';
        while ( lLetter <= 'z'){
            System.out.print(lLetter + " ");
            lLetter++;
            Thread.sleep(0);
        }
        //======================================================000=0=0=0=0=
        System.out.println();
        char myLetter = 'A';
        String alphabet = "";
        while (myLetter <= 'Z'){
            alphabet += myLetter + " ";
            System.out.println(alphabet);
            myLetter ++;
        }

    }
}