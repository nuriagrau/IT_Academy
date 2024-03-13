package n1exercici1;
public abstract class Instrument {
    private String nom;
    private int preu;

    // Constructor
    public Instrument(String nom, int preu) {
        this.nom = nom;
        this.preu = preu;
    }

    // Setters
    public String getNom() {
        return this.nom;
    }

    public int getPreu() {
        return this.preu;
    }

    // Getters

    public void setNom(String nouNom) {
        this.nom = nouNom;
    }

    public void setPreu(int nouPreu) {
        this.preu = nouPreu;
    }

    // Abstract method
    public abstract String tocar();
}

