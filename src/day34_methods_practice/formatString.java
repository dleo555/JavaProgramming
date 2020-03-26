package day34_methods_practice;

public class formatString {
    public static void main(String[] args) {
        getNumerOfGoogleSearchResults();
    }

    public static long getNumerOfGoogleSearchResults (){
        String results = "About 1,020,000,000 (0.58 sec.)";
        String countOfRs = results.split(" ") [1];//split and get index 1 (number of results)
        countOfRs = countOfRs.replace(",", "");

        long count = Long.parseLong(countOfRs);//convert string numbers into long
        System.out.println("Count in long format " + count);
        return count;
    }

    public static void repeatReturnString () {
        String word = "";
        int words = 0;
    }
}
