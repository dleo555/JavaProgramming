package day11_string_comparison_logical;

public class weatherIfElse {
    public static void main(String[] args) {
        String weather = "RaiN";

        //do not use if (weather == "sunny");
        if (weather.equals("sunny")) {
            System.out.println("Go to park");
            System.out.println("Code Java");
        }
        else if (weather.equalsIgnoreCase("rain")){
            System.out.println("IGNOTE");
        }
        else {
            System.out.println("Code JAVA ONLY");
        }
    }
}
