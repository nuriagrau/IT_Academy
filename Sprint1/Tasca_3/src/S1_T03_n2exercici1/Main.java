package S1_T03_n2exercici1;

import java.util.HashSet;

public class Main {

    // TODO Crea una classe anomenada Restaurant amb dos atributs: nom(String) i puntuació(int). Implementa els mètodes
    //  necessaris perquè no es puguin introduir objectes Restaurant amb el mateix nom i la mateixa puntuació en un
    //  HashSet creat en el main() de l’aplicació.
    static HashSet<Restaurant> restaurants = new HashSet<>();
    public static void main(String[] args) {

        restaurants.add(new Restaurant("Arcimboldo", 8));

        restaurants.add(new Restaurant("Arcimboldo", 9));

        restaurants.add(new Restaurant("Sèsam Negre", 9));

        // This will not be added as it has same name and puntuacio
        restaurants.add(new Restaurant("Sèsam Negre", 9));

        System.out.println("HashSet contains: " + restaurants.toString());
    }

}
