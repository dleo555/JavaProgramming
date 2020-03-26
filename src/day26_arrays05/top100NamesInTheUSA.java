package day26_arrays05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class top100NamesInTheUSA {
    public static void main(String[] args) {
        String[] names = {  "James","Mary",
                "John","Patricia",
                "Robert","Jennifer",
                "Michael","Linda",
                "William","Elizabeth",
                "David","Barbara",
                "Richard","Susan",
                "Joseph","Jessica",
                "Thomas","Sarah",
                "Charles","Margaret",
                "Christopher","Karen",
                "Daniel","Nancy",
                "Matthew","Lisa",
                "Anthony","Betty",
                "Donald","Dorothy",
                "Mark","Sandra",
                "Paul","Ashley",
                "Steven","Kimberly",
                "Andrew","Donna",
                "Kenneth","Emily",
                "George","Carol",
                "Joshua","Michelle",
                "Kevin","Amanda",
                "Brian","Melissa",
                "Edward","Deborah",
                "Ronald","Stephanie",
                "Timothy","Rebecca",
                "Jason","Laura",
                "Jeffrey","Helen",
                "Ryan","Sharon",
                "Jacob","Cynthia",
                "Gary","Kathleen",
                "Nicholas","Amy",
                "Eric","Shirley",
                "Stephen","Angela",
                "Jonathan","Anna",
                "Larry","Ruth",
                "Justin","Brenda",
                "Scott","Pamela",
                "Brandon","Nicole",
                "Frank","Katherine",
                "Benjamin","Samantha",
                "Gregory","Christine",
                "Raymond","Catherine",
                "Samuel","Virginia",
                "Patrick","Debra",
                "Alexander","Rachel",
                "Jack","Janet",
                "Dennis","Emma",
                "Jerry","Carolyn",
                "Tyler","Maria",
                "Aaron","Heather",
                "Henry","Diane",
                "Jose","Julie",
                "Douglas","Joyce",
                "Peter","Evelyn",
                "Adam","Joan",
                "Nathan","Victoria",
                "Zachary","Kelly",
                "Walter","Christina",
                "Kyle","Lauren",
                "Harold","Frances",
                "Carl","Martha",
                "Jeremy","Judith",
                "Gerald","Cheryl",
                "Keith","Megan",
                "Roger","Andrea",
                "Arthur","Olivia",
                "Terry","Ann",
                "Lawrence","Jean",
                "Sean","Alice",
                "Christian","Jacqueline",
                "Ethan","Hannah",
                "Austin","Doris",
                "Joe","Kathryn",
                "Albert","Gloria",
                "Jesse","Teresa",
                "Willie","Sara",
                "Billy","Janice",
                "Bryan","Marie",
                "Bruce","Julia",
                "Noah","Grace",
                "Jordan","Judy",
                "Dylan","Theresa",
                "Ralph","Madison",
                "Roy","Beverly",
                "Alan","Denise",
                "Wayne","Marilyn",
                "Eugene","Amber",
                "Juan","Danielle",
                "Gabriel","Rose",
                "Louis","Brittany",
                "Russell","Diana",
                "Randy","Abigail",
                "Vincent","Natalie",
                "Philip","Jane",
                "Logan","Lori",
                "Bobby","Alexis",
                "Harry","Tiffany",
                "Johnny","Kayla"};
        //count names
        System.out.println("Names count: " + names.length);

        //print all names
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        //=======================================
        System.out.println(Arrays.toString(names));

        //loop to find Sarah index
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Sarah")){
                System.out.println("Sarah index is " + i);
            }
        }

        //separate males from females names
        String maleNames = "";
        String femaleNames = "";
        for(int i = 0; i < names.length; i++){
            if(i % 2 == 0){
                maleNames += names[i]+", ";
            }else{
                femaleNames += names[i]+", ";
            }
        }
        System.out.println("MALE NAMES:"+maleNames);
        System.out.println("FEMALE NAMES:"+femaleNames);

        //whoes names are longer?
        double maleLeng = 0;
        double femaleLeng = 0;
        for(int i = 0; i < names.length; i++){
            if(i % 2 == 0){
                maleLeng += names[i].length();
            }else{
                femaleLeng += names[i].length();
            }
        }
        System.out.println("MALE NAMES Length: "+maleLeng /100);
        System.out.println("FEMALE NAMES Length: "+femaleLeng/100);

    }
}
