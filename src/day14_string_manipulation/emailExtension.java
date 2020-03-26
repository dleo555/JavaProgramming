package day14_string_manipulation;

import org.w3c.dom.ls.LSOutput;

public class emailExtension {
    public static void main(String[] args) {
        String email = "employee@gmail.com";

        if (email.contains("gmail")){
            System.out.println("Google Account");
        } else if (email.contains("yahoo")){
            System.out.println("Yahoo Account");
        }   else {
            System.out.println("Other type");
        }
    String name = "Pavel";
        if (name.contains("a") || name.contains("e")){
            System.out.println("He is Pavel");
        }else {
            System.out.println("He is no-name");
        }
        System.out.println(name.startsWith("P"));//true
        System.out.println(name.startsWith("Pav"));//true
    }
}
