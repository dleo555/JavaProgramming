package day38_methods_with_arrayList;
import java.util.*;
public class MethodsReturnArrayList {
    public static void main(String[] args) {
//=================================================================================
        System.out.println(getMonths());
//=================================================================================
        List<String> allMonthInYear = getMonths();
        System.out.println(allMonthInYear);
//=================================================================================
        for (int i = 0; i < 10; i++) {
            System.out.println(getIntList(i));
        }
    }
//Method: getMonths()
//Params:  none
//Return: List<String>
//Returns list with all month names.
    public static List <String> getMonths (){
        List <String> allMonth = new ArrayList<>();
        allMonth.add("January");allMonth.add("February");allMonth.add("March");
        allMonth.add("April");allMonth.add("May");allMonth.add("June");
        allMonth.add("July");allMonth.add("August");allMonth.add("September");
        allMonth.add("October");allMonth.add("November");allMonth.add("December");

        return allMonth;
    }

    public static List<Integer> getIntList(int size){
        List<Integer> numbers=new ArrayList<>();
        for (int i = 1; i <= size ; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}