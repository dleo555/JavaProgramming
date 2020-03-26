package day34_methods_practice;

public class WarmUpMethods {
    public static void main(String[] args) {
        login();
        drive("Porche" , 55);
    }
    //------------------------------------------------------------------------
    public static void login (){
        String userName = "";
        String password = "";
        if (userName.equalsIgnoreCase("student@cybertek.com")
                && password.equals("cybertekb15")){
            System.out.println("Login Successful, Welcome to Cybertek!");
        } else {
            System.out.println("Login Failed");
        }
    }
    //-------------------------------------------------------------------------
    public static void drive (String car, int speed) {
        if (speed< 0) {
            System.out.println("invalid speed");
        } else if (speed ==0){
            System.out.println(car + " is not moving");
        } else if (speed <= 55) {
            System.out.println(car + " is driving at 40 mph");
        } else if (speed > 55 && speed < 200) {
            System.out.println(car + " is speeding at 66 mph");
        } else {
            System.out.println(car + " is flying at 222 mph");
        }
    }
}
