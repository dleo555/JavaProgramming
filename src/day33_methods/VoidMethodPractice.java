package day33_methods;

public class VoidMethodPractice {
    public static void main(String[] args) {
        printDay(3);
    }
    public static void printDay(int day){
/*
        Method: printDay
        input: int day
        day -> 1 -> Monday
        day -> 2 -> Tuesday
        day -> 3 -> Wednesday
        day -> 4 -> Thursday
        day -> 5 -> Friday
        day -> 6 -> Saturday
        day -> 7 -> Sunday */

switch (day){
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
}
    }
}
