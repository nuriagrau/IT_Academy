package n3exercici1;
public class Basquet extends Noticia{
    final private int PREU_INICIAL = 250;
    final private int PUNTS_INICIALS = 4;

    public Basquet(String titular, String text, String competicio, String club) {
        super(titular, text, competicio, club);
    }

    public int calculPreu() {
        int preuNoticia = PREU_INICIAL;
        if (super.getCompeticio().equalsIgnoreCase("Eurolliga")) {
            preuNoticia += 75;
        } else if (super.getClub().equalsIgnoreCase("Barça") || super.getClub().equalsIgnoreCase("Madrid")) {
            preuNoticia += 75;
        }
        return preuNoticia;
    }

    public int calculPuntuacio() {
        int puntuacioNoticia = PUNTS_INICIALS;
        if (super.getCompeticio().equalsIgnoreCase("Eurolliga")) {
            puntuacioNoticia += 3;
        } else if (super.getCompeticio().equalsIgnoreCase("ACB")) {
            puntuacioNoticia += 2;
        }else if (super.getClub().equalsIgnoreCase("Barça") || super.getClub().equalsIgnoreCase("Madrid")) {
            puntuacioNoticia += 1;
        }
        return puntuacioNoticia;
    }

    public String toString() {
        return "Noticia de Bàsquet[titular=" + super.getTitular() + ", text=" + super.getText() + ", competicio=" +  super.getCompeticio() + ", club=" + super.getClub() + ", preu notícia=" + this.calculPreu() + ", puntuació notícia=" + this.calculPuntuacio() + "]";
    }
}

