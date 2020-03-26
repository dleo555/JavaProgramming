package day26_arrays05;

public class tools {
    public static void main(String[] args) {
        String[] tools = {"java", "selenium", "git", "junit", "jenkins", "cucumber"};
       /* Loop through the array and check the tool.
        java -> java --> fun programming language
        selenium -> selenium --> test automation
        git -> git -> version control
        junit -> junit -> testing tool
        jenkins -> jenkins -> continuous integration
        cucumber -> cucumber -> BDD style testing */

        for (int i = 0; i < 6; i++) {
            if (tools[i].equals("java")) {
                System.out.println("java --> fun programming language");
            } else if (tools[i].equals("selenium")) {
                System.out.println("selenium --> test automation");
            } else if (tools[i].equals("git")) {
                System.out.println("git -> version control");
            } else if (tools[i].equals("junit")) {
                System.out.println("junit -> testing tool");
            } else if (tools[i].equals("jenkins")) {
                System.out.println("jenkins -> continuous integration");
            } else if (tools[i].equals("cucumber")) {
                System.out.println("cucumber -> BDD style testing");
            }
        }
    }
}