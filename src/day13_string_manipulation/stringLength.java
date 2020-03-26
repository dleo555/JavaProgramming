package day13_string_manipulation;

public class stringLength {
    public static void main(String[] args) {
        String school = "Cybertek School";
        System.out.println(school.length());
        int count = school.length();
        System.out.println(school + " is " + count + " characters");

        String firstName = "Danich";
        String lastName = "Leo";

        int countName = firstName.length() + lastName.length();
        System.out.println(countName);
        System.out.println("--------------------------");
        String password = "qwerty12345";
        if (password.length() >=8){
            System.out.println("Pass matches req.");

        }else {
            System.out.println("Pass is to short");
        }
        System.out.println("--------------------------");
        String company = "Cybertek";
        System.out.println(company.length());
        System.out.println(company.charAt(0));//c
        System.out.println(company.charAt(1));//y
        System.out.println(company.charAt(2));//b
        System.out.println(company.charAt(3));//e
        System.out.println(company.charAt(4));//r
        System.out.println(company.charAt(5));//t
        System.out.println(company.charAt(6));//e
        System.out.println(company.charAt(7));//k

        System.out.println("------------------------");

        if (company.charAt(0)=='C'){
            System.out.println("C is first letter");
        } else {
            System.out.println("C is not first letter");
        }

        String word = "madam";
        System.out.println(word);
        char firstL = word.charAt(0);
        char lastL = word.charAt(4);

        if (firstL == lastL){
            System.out.println("It is a palindrome word!");
        } else {
            System.out.println("It is not a palindrome word!");
        }
        System.out.println(word.charAt(0) + " " + word.charAt(1) + " " + word.charAt(2) + " " + word.charAt(3) + " " + word.charAt(4));


        System.out.println(word.contains("m"));//true
    }
}
