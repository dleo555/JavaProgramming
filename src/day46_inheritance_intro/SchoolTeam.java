package day46_inheritance_intro;

public class SchoolTeam {
    public static void main(String[] args) {
        Person marufjon = new Person();
        marufjon.name = "Marufjon";
        marufjon.age = 22;
        marufjon.gender = 'M';
        //marufjon.course = "python"; ERROR because course variable came from Student subclass

        Student nadir = new Student();
        nadir.name = "Nadir";
        nadir.age = 25;
        nadir.gender = 'M';
        nadir.course = "python";

        Employee kiki = new Employee();
        kiki.name = "Kiki";
    }
}
