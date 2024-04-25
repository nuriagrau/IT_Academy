package n3exercici1;
public class Basquet extends Noticia{
    final private int PREU_INICIAL = 250;
    final private int PUNTS_INICIALS = 4;

    public Basquet(String titular, String text, String competicio, String club) {
        super(titular, text, competicio, club);
    }

    @Override
    public int calculPreu() {
        int preuNoticia = PREU_INICIAL;
        if (super.competicio.equalsIgnoreCase("Eurolliga")) {
            preuNoticia += 75;
        } else if (super.club.equalsIgnoreCase("Barça") || super.club.equalsIgnoreCase("Madrid")) {
            preuNoticia += 75;
        }
        return preuNoticia;
    }


    @Override
    public int calculPuntuacio() {
        int puntuacioNoticia = PUNTS_INICIALS;
        if (super.competicio.equalsIgnoreCase("Eurolliga")) {
            puntuacioNoticia += 3;
        } else if (super.competicio.equalsIgnoreCase("ACB")) {
            puntuacioNoticia += 2;
        }else if (super.club.equalsIgnoreCase("Barça") || super.club.equalsIgnoreCase("Madrid")) {
            puntuacioNoticia += 1;
        }
        return puntuacioNoticia;
    }

    @Override
    public String toString() {
        return "Noticia de Bàsquet[titular=" + super.titular + ", text=" + super.text + ", competicio=" +  super.competicio + ", club=" + super.club + ", preu notícia=" + this.calculPreu() + ", puntuació notícia=" + this.calculPuntuacio() + "]";
    }
}

