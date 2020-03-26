package day11_string_comparison_logical;

public class passwordUsernameEqualsMethod {
    public static void main(String[] args) {
        String userName = "cbt";
        String password = "abc1234";

        if (userName.equalsIgnoreCase("cbtuser") && password.equals("abc123")) {
            System.out.println("Login Successgul, Welcome!");
        } else if (userName.equalsIgnoreCase("cbtuser") && !password.equals("abc123")) {
            System.out.println("Invalid Password, Try Again!");
        } else if (!userName.equalsIgnoreCase("cbtuser") && password.equals("abc123")) {
            System.out.println("Invalid Username, Try Again!");
        } else if (!userName.equalsIgnoreCase("cbtuser") && !password.equals("abc123")) {
            System.out.println("Invalid Username and Password, Try Again!");
        }
    }
}
