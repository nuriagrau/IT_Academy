package S1_02_n1exercici1;

import java.util.Scanner;
import java.util.ArrayList;

public class Botiga {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Producte> productesExistents = new ArrayList<Producte>();

    static int indexProductes = -1, indexProductesExistents = -1;
    static String missatge = "", nom = "";
    static float preu = 0f;

    public static String crearProducte() {
        missatge = "";
        nom = getInputUser("Introdueix el nom del producte que vols crear: ", nom);
        try {
            indexProductesExistents = buscarProducteExistent(nom);
            if (indexProductesExistents != -1) {
                ProducteExistentException me  = new ProducteExistentException("El producte " + nom + " ja existeix\n");
                throw me;

            } else {
                preu = getInputUser("Introdueix el preu del producte: ", preu);
                Producte producte = new Producte(nom, preu);
                productesExistents.add(producte);
                missatge = "El producte " + nom + " s'ha creat correctament\n";
            }

        } catch (ProducteExistentException e){
            System.out.println(e.toString());
        }
        return missatge;
    }

    public static String afegirProducte(Venda venda) {
        missatge = "";
        indexProductes = -1;
        nom = getInputUser("Introdueix el nom del producte que afegir a venda: ", nom);
        try {
            indexProductesExistents = buscarProducteExistent(nom);
            if (indexProductesExistents == -1) {
                ProducteNoExistentException me = new ProducteNoExistentException("Aquest producte no existeix\n");
                throw me;
            } else {
                indexProductes = venda.buscarProducteAVenda(nom);
                if (indexProductes == -1) {
                    venda.afegirProducte(productesExistents.get(indexProductesExistents));
                    missatge = "El producte " + nom + " s'ha afegit correctament a venda\n";
                } else {
                    missatge = "El producte " + nom + " ja està a venda\n";
                }
            }
        } catch(ProducteNoExistentException e) {
            System.out.println(e.toString());

        }
        return missatge;
    }

    public static String calcularTotalVenda(Venda venda) {
        missatge = "";
        try {
            venda.calcularTotal();
            if (venda.getProductes().isEmpty()) {
                VendaBuidaException me = new VendaBuidaException("Per fer una venda primer has d'afegir productes\n");
                throw me;
            } else {
                missatge =  "El preu total de la venda és de: " + venda.getPreuTotal() + "\n";
            }
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }
        return missatge;
    }

    public static String provocarArrayIndexOutOfBounds() {
        missatge = "";
        try {
            float preus[];
            preus = new float[productesExistents.size()];
            float ultimPreu = preus[productesExistents.size()];

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("S'ha provocat un ArrayIndexOutOfBounds exception.\n");
        }
        return missatge;
    }

    public static String getInputUser(String solicitudDada, String dada) {
        System.out.println(solicitudDada);
        return scanner.next();
    }

    public static float getInputUser(String solicitudDada, float dada) {
        System.out.println(solicitudDada);
        return scanner.nextFloat();
    }

    public static int buscarProducteExistent(String nom) {
        int indexProductes = -1;
        if (productesExistents.size() > 0) {
            for (int i = 0; i < productesExistents.size(); i++) {
                if (productesExistents.get(i).getNom().equalsIgnoreCase(nom)) {
                    indexProductes = i;
                }
            }
        }
        return indexProductes;
    }
}
