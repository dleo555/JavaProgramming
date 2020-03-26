package day63_collections5_LAST_DAY;
import java.util.*;
public class ListOfMaps {
    public static void main(String[] args) {
        List <Map<String, String>> employees = new ArrayList<>();

        Map <String, String> emp1Data = new HashMap<>();
        emp1Data.put("EmplID", "123");
        emp1Data.put("EMPName", "John Doe");
        emp1Data.put("JobTitle", "SDET");
        emp1Data.put("Salary", "103000");

        Map<String, String> emp2Data = new HashMap<>();
        emp1Data.put("EmplID", "124");
        emp1Data.put("EMPName", "Ahmet Toran");
        emp1Data.put("JobTitle", "Developer");
        emp1Data.put("Salary", "250000");



    }
}
