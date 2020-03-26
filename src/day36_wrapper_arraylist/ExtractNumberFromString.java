package day36_wrapper_arraylist;

public class ExtractNumberFromString {
    public static void main(String[] args) {
        String str = "java123%is45 fun$0";
        //print only numbers
        for (int i = 0; i < str.length(); i++) {
            char tempChar = str.charAt(i);
            if(Character.isDigit(tempChar)){
                System.out.print(tempChar);
            }
        }
        //declare 2 String variables:
        //String letters = "";
        //String numbers = "";
        //store all letters and numbers to above variables and print out
//        for(char ch : str.toCharArray()){
//
//        }
        String letters = "";
        String numbers = "";
        for(int n = 0; n < str.length(); n++){
            char temp = str.charAt(n);
            if(Character.isLetter(temp)){
                letters += temp;
            }else if (Character.isDigit(temp)){
                numbers += temp;
            }
        }
        System.out.println("\nstr = " + str);
        System.out.println("numbers = " + numbers);
        System.out.println("letters = " + letters);


        System.out.println(getAllNumbers("java123%is45 fun$0"));
        System.out.println(getAllNumbers2("java123%is45 fun$0"));
        System.out.println(getAllNumbers("01"));
    }
//=============================================================================================================
    public static Integer getAllNumbers(String str){
        String numbers = "";
        for(int n = 0; n < str.length(); n++){
        if(Character.isDigit(str.charAt(n))){
            numbers += str.charAt(n);
        }
    }
         //convert String to Integer wrapper
         if (numbers.isEmpty()){
        return 0;
         }else{
        return Integer.valueOf(numbers);
    }
}
//==============================================================================================================
    public static Integer getAllNumbers2 (String strNum){
        if(strNum.replaceAll("[^0-9]","").isEmpty()) return 0;
        return Integer.parseInt(strNum.replaceAll("[^0-9]",""));
    }
}
