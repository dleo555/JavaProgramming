package day06_operators;

public class minutesHours {
    public static void main(String [] args){
        int minutes = 1000;
        int hours = minutes/60;
        System.out.println(hours);
        int remainMinutes = minutes%60;
        System.out.println(remainMinutes);
        System.out.println(hours + " hr. " + remainMinutes + " min.");
    }
}
