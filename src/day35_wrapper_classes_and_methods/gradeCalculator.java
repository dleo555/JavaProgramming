package day35_wrapper_classes_and_methods;

public class gradeCalculator {
    public static void main(String[] args) {
        System.out.println(getGrade(101));
        System.out.println(getGrade(55));
    }

    public static char getGrade(int score){
        char grade;
        if(score >=94 && score <= 100 ){
            grade = 'A';
        }else if(score >= 80 && score <= 93){
            grade = 'B';
        }else if (score >= 50 && score <= 79){
            grade = 'C';
        }else if (score >= 30 && score <= 49){
            grade = 'D';
        }else if (score >= 0 && score <= 29){
            grade = 'F';
        }else{
            System.out.println("ERROR: Invalid Score-"+score);
            grade = '0';
        }
        return grade;
        //=======================================================================
        /*
        if(score >=94 && score <= 100 ){
           return 'A';
        }else if(score >= 80 && score <= 93){
            return 'B';
        }else if (score >= 50 && score <= 79){
            return 'C';
        }else if (score >= 30 && score <= 49){
            return 'D';
        }else if (score >= 0 && score <= 29){
            return 'F';
        }else{
            System.out.println("ERROR: Invalid Score-"+score);
            return '0';
        }
        */
    }
}