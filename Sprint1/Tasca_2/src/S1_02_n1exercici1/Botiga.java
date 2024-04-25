package S1_02_n1exercici1;

import java.util.Scanner;
import java.util.ArrayList;

public class Botiga {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Producte> productesExistents = new ArrayList<Producte>();

    static int indexProductes = -1, indexProductesExistents = -1;
    static String missatge = "", nom = "";
    static float preu = 0f;

    public static String crearProducte() throws ProducteExistentException{
        missatge = "";
        nom = getInputUser("Introdueix el nom del producte que vols crear: ", nom);
        indexProductesExistents = buscarProducteExistent(nom);
        if (indexProductesExistents != -1) {
            // throw new exception del tipo
            throw new ProducteExistentException("El producte " + nom + " ja existeix\n");

        } else {
            preu = getInputUser("Introdueix el preu del producte: ", preu);
            Producte producte = new Producte(nom, preu);
            productesExistents.add(producte);
            missatge = "El producte " + nom + " s'ha creat correctament\n";
            }
        return missatge;
    }

    public static String afegirProducte(Venda venda) throws ProducteNoExistentException {
        missatge = "";
        indexProductes = -1;
        nom = getInputUser("Introdueix el nom del producte que afegir a venda: ", nom);
        indexProductesExistents = buscarProducteExistent(nom);
        if (indexProductesExistents == -1) {
            throw new ProducteNoExistentException("Aquest producte no existeix\n");

        } else {
            indexProductes = venda.buscarProducteAVenda(nom);
            if (indexProductes == -1) {
                venda.afegirProducte(productesExistents.get(indexProductesExistents));
                missatge = "El producte " + nom + " s'ha afegit correctament a venda\n" +
                        "Venda té ara els següents productes:" + venda.getProductes().toString()+ "\n";
            } else {
                missatge = "El producte " + nom + " ja està a venda\n";
            }
        }
        return missatge;
    }

    public static String calcularTotalVenda(Venda venda) throws VendaBuidaException{
        missatge = "";
        venda.calcularTotal();
        if (venda.getProductes().isEmpty()) {
            throw new VendaBuidaException("Per fer una venda primer has d'afegir productes\n");
        } else {
            missatge =  "El preu total de la venda és de: " + venda.getPreuTotal() + "\n";
        }
        return missatge;
    }

    public static String provocarArrayIndexOutOfBounds() throws ArrayIndexOutOfBoundsException{
        missatge = "";
        float preus[];
        preus = new float[productesExistents.size()];
        float ultimPreu = preus[productesExistents.size()];
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
