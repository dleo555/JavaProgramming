package day11_string_comparison_logical;

public class stringEquals {
    public static void main(String[] args) {
        String str = "java";
        String str2 = new String("java");

        System.out.println(str == "java"); //true
        System.out.println(str2 == "java"); //false
//compare using equals method
        System.out.println(str.equals("java"));//true
        System.out.println(str2.equals("java"));//true
        System.out.println(str2.equals("Java"));//false
//compare using equal ignore case method
        System.out.println(str.equalsIgnoreCase("JAVA"));//true
        System.out.println(str.equalsIgnoreCase(str2));//true
        System.out.println(str.equalsIgnoreCase(str));//true
    }
}
