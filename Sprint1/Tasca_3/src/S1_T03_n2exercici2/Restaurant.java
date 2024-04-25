package S1_T03_n2exercici2;


import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>{
    private String nom;
    private int punts;

    public Restaurant(String nom, int punts) {
        this.nom = nom;
        this.punts = punts;
    }

    public String getNom() {
        return this.nom;
    }

    public int getPunts() {
        return this.punts;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, punts);
    }

    @Override
    public boolean equals(Object other){
        Restaurant otherRestaurant = (Restaurant) other;
        if (this.nom.equalsIgnoreCase(otherRestaurant.nom ) && this.punts == otherRestaurant.punts) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Restaurant [nom=" + this.nom + ", puntuacio=" + this.punts + "]";
    }

    @Override
    public int compareTo(Restaurant o) {
        if (this.nom.compareTo(o.nom) == 0) {
            if (this.punts > o.punts) {
                return 1;
            } else if (this.punts < o.punts) {
                return -1;
            } else {
                return 0;
            }
        } else return this.nom.compareTo(o.nom);
    }
}
