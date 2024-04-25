package n1exercici1;
public abstract class Instrument {
    protected String nom;
    protected int preu;

    public Instrument(String nom, int preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return this.nom;
    }

    public int getPreu() {
        return this.preu;
    }

    public void setNom(String nouNom) {
        this.nom = nouNom;
    }

    public void setPreu(int nouPreu) {
        this.preu = nouPreu;
    }


    public abstract String tocar();
}

