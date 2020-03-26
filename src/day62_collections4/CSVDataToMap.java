package day62_collections4;
import java.util.*;
import java.nio.file.*;
import java.io.*;
import java.util.jar.JarOutputStream;

public class CSVDataToMap {
    public static void main(String[] args) throws Exception{
        // String fileName = "/Users/cybertekb15/Downloads/countryCodes.csv";//filename with path
        String fileName = "countryCodes.csv";//filename with path
        File dataFile = new File(fileName);
        System.out.println(dataFile.exists());
        Scanner scan = new Scanner(dataFile);
        //System.out.println(scan.nextLine());
        //System.out.println(scan.nextLine());
        int counter = 1;
        List<String> fileDataList = new ArrayList<>();
        while (scan.hasNextLine()){
            String row =  scan.nextLine();
            System.out.println(counter +". "+ row);
            fileDataList.add(row);
            counter++;
        }
        scan.close();
        System.out.println(fileName + " contains " + fileDataList.size() + " rows");
        System.out.println("-- READ FROM CSV FILE USING NEW WAY--");
        List<String> countryCodesList = Files.readAllLines(Paths.get(fileName));
        System.out.println(countryCodesList.size());
        System.out.println(countryCodesList.get(0));
        System.out.println(countryCodesList.toString());

        System.out.println("======================= After break ======================");

        //how to retrieve unique - non-duplicate country codes?
        Set<String> countryCodesSet = new HashSet<>(countryCodesList);

        System.out.println("unique country codes count: " + countryCodesSet.size());
        System.out.println(countryCodesSet.toString());

        //store each country code and country name into hashMap
        Map<String, String> countriesMap = new TreeMap<>();
        //loop through the CountryCodeSet
        for (String eachLine : countryCodesSet) {
            //split each item with coma
            String[] arr = eachLine.split(",");
            //store index 0 as a key, and index 1 as a value to the Map
            countriesMap.put(arr[0], arr[1]);
        }

        System.out.println(countriesMap.toString());
        System.out.println(countriesMap.size());
        System.out.println(countriesMap.containsValue("Mongolia"));
        System.out.println(countriesMap.get("PE"));
        System.out.println(countriesMap.get("US"));
        System.out.println(countriesMap.get("KG"));
        System.out.println(countriesMap.get("PH"));

        System.out.println("----PRINT ALL VALUES USING FOREACH LOOP + LAMBA----");
        countriesMap.forEach((k, v) -> System.out.println(k + "-" + v));



    }
}
