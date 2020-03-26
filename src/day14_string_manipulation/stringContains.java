package day14_string_manipulation;

public class stringContains {
    public static void main(String[] args) {
        String email = "student@gmail.com";
        System.out.println(email.contains("@"));
        System.out.println(email.contains("gmail"));

        String list = "milk, eggs, bread, turkey, water, chocolate, potatoes, apples";

        if (list.contains("turkey")){
            System.out.println("Turkey is there!");
        }else {
            System.out.println("We forgot turkey!");
        }


    }

}
