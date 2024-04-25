package S1_T03_n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> year = new ArrayList<Month>();

        year.add(new Month("January"));
        year.add(new Month("February"));
        year.add(new Month("March"));
        year.add(new Month("April"));
        year.add(new Month("May"));
        year.add(new Month("June"));
        year.add(new Month("July"));
        year.add(new Month("September"));
        year.add(new Month("October"));
        year.add(new Month("November"));
        year.add(new Month("December"));

        year.add(7, new Month("August"));

        System.out.println("The values in ArrayList year are: ");
        for (int i = 0; i < year.size(); i++) {
            System.out.println(year.get(i).getName());
        }
        System.out.println();

        HashSet<Month> MonthSet = new HashSet<>();
        for (int i = 0; i < year.size(); i++) {
            MonthSet.add(year.get(i));
        }

        System.out.println("The size of Hash before adding again the year[8] element is: " + MonthSet.size());
        System.out.println((MonthSet.add(year.get(8)))? "Duplicates are allowed": "Duplicates are not allowed");
        System.out.println("The size of Hash after adding again the year[8] element is: " + MonthSet.size() + "\n");

        System.out.println("The for values of the HashSet are : ");
        for (Month month : MonthSet) {
            System.out.println(month.getName());
        }
        System.out.println();

        Iterator iterator = MonthSet.iterator();
        System.out.println("The iterator values of the HashSet are: ");
        while (iterator.hasNext()) {
            Month month = (Month) iterator.next();
            System.out.println(month.getName());
        }
        System.out.println();

    }
}
