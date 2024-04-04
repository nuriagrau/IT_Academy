package S1_T03_n2exercici2;


import java.util.*;
import java.util.stream.Collectors;


public class Main {

    // TODO Utilitzant la classe del programa anterior, crea la implementació necessària perquè els objectes de la
    //  classe Restaurant estiguin ordenats per nom i per puntuació en ordre ascendent.

    static HashSet<Restaurant> restaurants = new HashSet<>();
    public static void main(String[] args) {

        restaurants.add(new Restaurant("Arcimboldo", 8));

        restaurants.add(new Restaurant("Arcimboldo", 9));

        restaurants.add(new Restaurant("Sèsam Negre", 9));

        // This will not be added as it has same name and puntuacio
        restaurants.add(new Restaurant("Sèsam Negre", 9));

        HashSet<Restaurant> sortedRestaurants = (HashSet<Restaurant>) restaurants.stream()
                .sorted(Comparator.comparing(Restaurant::getNom).thenComparing(Restaurant::getPunts))
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println("HashSet contains: " + restaurants.toString());
        System.out.println("SortedHashSet contains: " + sortedRestaurants.toString());
    }
}
