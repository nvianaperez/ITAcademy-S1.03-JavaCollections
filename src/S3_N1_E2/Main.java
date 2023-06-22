package S3_N1_E2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

//        Create and fill a list of integers
        int initialCapacity = 5;
        List<Integer> integerList = new ArrayList<>(initialCapacity);

        for (int i = 0; i < initialCapacity; i++) {
            integerList.add(i+1);
            System.out.println(integerList.get(i));
        }

//        Create second list of integers
        List<Integer> integerList1 = new ArrayList<>(initialCapacity);

        for (int i = 0; i < initialCapacity; i++) {
            integerList1.add(i+1+100);
            System.out.println(integerList1.get(i));
        }

//        Insert in the second list the elements of the previuos list in a reverse way, with ListIterator
        for (ListIterator<Integer> it = integerList.listIterator(integerList.size()); it.hasPrevious();) {
            integerList1.add(it.previous());
        }
        System.out.println(integerList1);

    }
}
