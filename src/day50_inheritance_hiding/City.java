package day50_inheritance_hiding;

public class City extends Object{
    private String name;
    public City() {
        name = "undefined";
    }
    //Paris
    public City(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "name = "+name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

