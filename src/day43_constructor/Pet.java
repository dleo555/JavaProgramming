package day43_constructor;

public class Pet {
    private String type;
    private String name;

    public Pet () {
        System.out.println("Pet on-arg constructor");
    }
    public Pet (String type, String name){
        this.type = type;
        this.name = name;
        System.out.println("Pet 2 args constructor");
    }

    public String getType () {
        return type;
    }

    public void setType (String type) {
        this.type = type;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void speak () {
        switch (type){
            case "dog":
                System.out.println("gav gav");
                break;
            case "cat":
                System.out.println("meow meow");
                break;
            case "fish":
                System.out.println("bul bul");
                break;
            case "bird":
                System.out.println("chick cherik");
                break;
            case "lion":
                System.out.println("rooaarr rooaarr");
                break;
            default:
                System.out.println("java java");

        }
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
