package day26_arrays05;

public class CanvasURL {
    public static void main(String[] args) {
        String str = "www.learn.cybertekschool.com/courses/288/modules";
        /* base url: www.learn.cybertekschool.com
        resource: courses
        Id : 288
        target: modules */
        String [] wordsArray = str.split("/");
        String baseURL = wordsArray [0];
        String resource = wordsArray [1];
        String id = wordsArray [2];
        String target = wordsArray [3];

        System.out.println(baseURL);
        System.out.println(resource);
        System.out.println(id);
        System.out.println(target);


    }
}
