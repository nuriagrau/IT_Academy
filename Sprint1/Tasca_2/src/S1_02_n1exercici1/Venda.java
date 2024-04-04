package S1_02_n1exercici1;

import java.util.ArrayList;

public class Venda {
    private ArrayList<Producte> productes;
    private float preuTotal;

    public Venda() {
        this.productes = new ArrayList<Producte>();
        this.preuTotal = 0;
    }

    public ArrayList<Producte> getProductes() {
        return this.productes;
    }

    public float getPreuTotal() {
        return this.preuTotal;
    }

    public void setPreuTotal() {
        this.preuTotal = preuTotal;
    }


    public void calcularTotal() {
        float preuTotal = 0f;
        for (int i = 0; i < this.productes.size(); i++) {
            preuTotal += this.productes.get(i).getPreu();
        }
        this.preuTotal = preuTotal;
    }

    public int buscarProducteAVenda(String nom) {
        int indexProductes = -1;
        if (this.productes.size() > 0) {
            for (int i = 0; i < this.productes.size(); i++) {
                if (this.productes.get(i).getNom().equalsIgnoreCase(nom)) {
                    indexProductes = i;
                }
            }
        }
        return indexProductes;
    }

    public void afegirProducte(Producte producte) {
        this.productes.add(producte);
    }

    @Override
    public String toString() {
        return "S1_02_n1exercici1.Venda=[productes=" + this.productes.toString() + "]";
    }
}
