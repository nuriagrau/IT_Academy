package S1_T03_n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Month {

    private String name;

    public Month(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toSring() {
        return "Month [name=" + this.name + "]";
    }

    public static void main(String[] args) {
        boolean allowsDuplicates = false;
        String duplicatesAllowed = "";

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
            System.out.println(year.get(i).name);
        }
        System.out.println();

        // Creating an empty hash set
        HashSet<Month> MonthSet = new HashSet<>();

        // Add elements into the Hash set
        for (int i = 0; i < year.size(); i++) {
            MonthSet.add(year.get(i));
        }

        // add() Used to add the specified element if it is not present, if it is present then return false.
        System.out.println("The size of Hash before adding again the year[8] element is: " + MonthSet.size());
        System.out.println((MonthSet.add(year.get(8)))? "Duplicates are allowed": "Duplicates are not allowed");
        System.out.println("The size of Hash after adding again the year[8] element is: " + MonthSet.size() + "\n");

        // Displaying the hash set
        System.out.println("The for values of the HashSet are : ");
        for (Month month : MonthSet) {
            System.out.println(month.getName());
        }
        System.out.println();

        // Creating an iterator
        Iterator iterator = MonthSet.iterator();

        // Displaying the values after iterating through the set
        System.out.println("The iterator values of the HashSet are: ");
        while (iterator.hasNext()) {
            Month month = (Month) iterator.next();
            System.out.println(month.getName());
        }
        System.out.println();

    }

}

