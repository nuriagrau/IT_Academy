package S1_02_n1exercici1;

public class Producte {
    private String nom;
    private float preu;

    public Producte(String nom, float preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return this.nom;
    }

    public float getPreu() {
        return this.preu;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "S1_02_n1exercici1.Producte [nom=" + this.nom + ", preu=" + this.preu + "]";
    }

}
