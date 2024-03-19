package S1_02_n1exercici1;

public class Producte {
    private String nom;
    private float preu;

    // Constructor
    public Producte(String nom, float preu) {
        this.nom = nom;
        this.preu = preu;
    }

    // Getters
    public String getNom() {
        return this.nom;
    }

    public float getPreu() {
        return this.preu;
    }

    // Setters
    public void getNom(String nom) {
        this.nom = nom;
    }

    public void getPreu(float preu) {
        this.preu = preu;
    }

    public String toString() {
        return "S1_02_n1exercici1.Producte [nom=" + this.nom + ", preu=" + this.preu + "]";
    }

}
