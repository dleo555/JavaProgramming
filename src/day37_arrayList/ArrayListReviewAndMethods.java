package day37_arrayList;
import java.util.*;
public class ArrayListReviewAndMethods {
    public static void main(String[] args) {
        /*Method                         Description
          add(Type element)              Adds the element into the end of the list.
          get(int index)                 Returns the element at the specified position.
          contains(Object element)       Returns true if element is in the list; returns false if not.
          indexOf(Object element)        Returns the index of the first occurrence of an element in the list.
          clear()                        Removes all the items from the list.
          size()                         Returns the number of elements in the list.
          remove(int index)              Removes the element at the specified index of the list.
          isEmpty()                      Returns true if the list empty, otherwise returns false.
          set(int index, Object element) Overwrite the value at given index */

        ArrayList <String> cities = new ArrayList<>();
        cities.add("McLean");
        cities.add("Alexandria");
        cities.add("Baltimore");
        cities.add("Baku");
        cities.add("Kabul");
        cities.add("Tashkent");
        cities.add("Tehran");
        cities.add("Asmara");
        cities.add(0, "Calamba"); //add Calamba to index 0
        cities.add(1, "Reston"); //add Reston to index 1

        System.out.println(cities); //print all cities
        // [Calamba, Reston, McLean, Alexandria, Baltimore, Baku, Kabul, Tashkent, Tehran, Asmara]

        cities.add(2, "Yerevan"); //add Yerevan to index 2
        System.out.println(cities); //print all cities after adding Yerevan
        //[Calamba, Reston, Yerevan, McLean, Alexandria, Baltimore, Baku, Kabul, Tashkent, Tehran, Asmara]

        cities.add(4, "New York");
        System.out.println(cities); //print all cities after adding New York
        //[Calamba, Reston, Yerevan, McLean, New York, Alexandria, Baltimore, Baku, Kabul, Tashkent, Tehran, Asmara]

        cities.set(6, "Samarkan"); //change index 6 to Samarkan
        System.out.println(cities);
        //[Calamba, Reston, Yerevan, McLean, New York, Alexandria, Samarkan, Baku, Kabul, Tashkent, Tehran, Asmara]

        cities.remove(3); //remove city at index 3
        System.out.println(cities);
        //[Calamba, Reston, Yerevan, New York, Alexandria, Samarkan, Baku, Kabul, Tashkent, Tehran, Asmara]

        cities.remove("New York"); //remove New York no matter the index
        System.out.println(cities);
        //[Calamba, Reston, Yerevan, Alexandria, Samarkan, Baku, Kabul, Tashkent, Tehran, Asmara]




    }
}
