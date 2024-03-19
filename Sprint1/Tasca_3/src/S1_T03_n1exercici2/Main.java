package S1_T03_n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        int n = 4;
        List<Integer> list1 = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list1.add(i);
        }

        System.out.println("List 1: " + list1);

        List<Integer> list2 = new ArrayList<>(list1.reversed());
        System.out.println("List 2: " + list2);

        ListIterator<Integer> list2Iterator = list2.listIterator();

        while (list2Iterator.hasNext()) {
            list1.add((Integer) list2Iterator.next());
       }
       System.out.println("List 1 after adding list2 with ListIterator: " + list1);
    }
}
