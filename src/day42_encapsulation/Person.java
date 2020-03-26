package day42_encapsulation;

public class Person {
    private String name;
    private int age;
//-----------------------------------------------------------------------------------------------
    //getter (READ ONLY)/setter(WRITE ONLY) for name
    public String getName() {    //GET
        return name;
    }
    public void setName(String newName) {    //SET
        if (!newName.isEmpty()) {
            name = newName;
        } else {
            System.out.println("ERROR: name cannot be empty");
        }
    }
    //-----------------------------------------------------------------------------------------------
    public void setAge(int newAge) {         //SET
        if (newAge > 0 && newAge < 120) {
            age = newAge;
        } else {
            System.out.println("ERROR: Invalid age.");
        }
    }
    public int getAge () {     //GET
        return age;
    }
    //-----------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

