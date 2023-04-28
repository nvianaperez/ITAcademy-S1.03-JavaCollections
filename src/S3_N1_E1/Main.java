package S3_N1_E1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        Create an ArrayList with 11 initial capacity
        ArrayList<Month> monthArrayList = new ArrayList<>(11);

//        Add 11 month objects to ArrayList
        monthArrayList.add(new Month("Gener"));
        monthArrayList.add(new Month("Febrer"));
        monthArrayList.add(new Month("Març"));
        monthArrayList.add(new Month("Abril"));
        monthArrayList.add(new Month("Maig"));
        monthArrayList.add(new Month("Juny"));
        monthArrayList.add(new Month("Juliol"));
        monthArrayList.add(new Month("Setembre"));
        monthArrayList.add(new Month("Octubre"));
        monthArrayList.add(new Month("Novembre"));
        monthArrayList.add(new Month("Desembre"));

//        Add "Agost" object in the correct position
        monthArrayList.add(7,new Month("Agost"));

        System.out.println("Show position in monthArrayList: ");
        for ( Month month : monthArrayList) {
            System.out.println(month.getName());
        }

//        Convert Arraylist in a Set
        Set<Month> monthSet = new HashSet<>(monthArrayList);

//        Add a duplicate to the monthSet
        monthSet.add(new Month("Gener"));

//        Show Set without duplicates
        System.out.println("Show the monthSet with enhanced for: ");
        for (Month month : monthSet) {
            System.out.println(month.getName());
        }

        System.out.println("Show the monthSet with iterator: ");
        for (Iterator<Month> it = monthSet.iterator(); it.hasNext();) {
            System.out.println(it.next().getName());
        }
    }
}
