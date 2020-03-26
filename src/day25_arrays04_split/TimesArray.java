package day25_arrays04_split;

public class TimesArray {
    public static void main(String[] args) {
        int [] time1 = {12, 45};
        int [] time2 = {12, 35};

        // if time 1 is earlier print time1 is earlier, and vice versa
        if (time1 [0] < time2 [0]){
            System.out.println("Time1 is earlier " + time1[0] + ":" + time1[1]);
        } else if (time1 [0] > time2 [0]) {
            System.out.println("Time2 is earlier " + time2[0] + ":" + time2[1]);
        } else if (time1 [1] < time2 [1]) {
            System.out.println("Time1 is earlier " + time1[0] + ":" + time1[1]);
        } else if (time1 [1] > time2 [1]){
                System.out.println("Time2 is earlier " + time2[0] + ":" + time2[1]);
        } else {
            System.out.println("Time1 and Time2 are the same " + time1[0] + ":" + time1[1]);
        }

    }
}
