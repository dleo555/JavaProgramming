package day21_for_loop_3;

public class LookForError {
    public static void main(String[] args) {
        String log = "<error:atable style=display: none;<tbody><error:btr " +
                "id=edit_rubric><td coerror:qlspan=4><form id=error:jedit_rubric_form " +
                "class=edit-rubric-formerror:p no-margin-bottom>error:a";
        //count # of errors
        //additionally, print type of error
        int errorsCount = 0;
        for (int i = 0; i < log.length() - 4; i++) {
           // System.out.println(log.substring(i, i+5));
            String tempStr = log.substring(i, i+5);
            if (tempStr.equals("error")){
                System.out.println("Error found! At index: " + i);
                errorsCount++;
                //<error:a. Print error type
                System.out.println("ERROR TYPE: " + log.charAt(i+6));
                }
        }
        if (errorsCount>0){
            System.out.println("Error count is: " + errorsCount);
        } else {
            System.out.println("No errors");
        }
    }
}
