package n3exercici1;
public class Futbol extends Noticia{
    private String jugador;
    final private int PREU_INICIAL = 300;
    final private int PUNTS_INICIALS = 5;

    public Futbol(String titular, String text, String competicio, String club, String jugador) {
        super(titular, text, competicio, club);
        this.jugador = jugador;
    }

    public String getJugador() {
        return this.jugador;
    }

    public void setJugador() {
        this.jugador = jugador;
    }

    @Override
    public int calculPreu() {
        int preuNoticia = PREU_INICIAL;
        if (super.competicio.equalsIgnoreCase("Lliga de Campions")) {
            preuNoticia += 100;
        } else if (super.club.equalsIgnoreCase("Barça") || super.club.equalsIgnoreCase("Madrid")) {
            preuNoticia += 100;
        } else if (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")) {
            preuNoticia += 50;
        }
        return preuNoticia;
    }

    @Override
    public int calculPuntuacio() {
        int puntuacioNoticia = PUNTS_INICIALS;
        if (super.competicio.equalsIgnoreCase("Lliga de Campions")) {
            puntuacioNoticia += 3;
        } else if (super.competicio.equalsIgnoreCase("LLiga")){
            puntuacioNoticia += 2;
        } else if (super.club.equalsIgnoreCase("Barça") || super.club.equalsIgnoreCase("Madrid")) {
            puntuacioNoticia += 1;
        } else if (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema")) {
            puntuacioNoticia += 1;
        }

        return puntuacioNoticia;
    }

    @Override
    public String toString() {
        return "Noticia de Fútbol [titular=" + super.getTitular() + ", text=" + super.getText() + ", competicio=" +  super.getCompeticio() + ", club=" + super.getClub() + ", jugador=" + this.jugador + ", preu notícia=" + this.calculPreu() + ", puntuació notícia=" + this.calculPuntuacio() + "]";
    }

}