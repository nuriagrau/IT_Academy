package S1_T03_n2exercici1;

import java.util.Objects;

public class Restaurant {
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

    @Override // Overriding hashCode() we can modify the criteria to calculate the hashCode
    public int hashCode() {
        return Objects.hash(nom, punts);
    }

    @Override // Overriding equals we can modify the criteria of when an object equals another
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

}
