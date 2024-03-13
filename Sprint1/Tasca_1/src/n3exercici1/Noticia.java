package n3exercici1;

public abstract class Noticia {
    private String titular;
    private String text;
    private int puntuacio;
    private int preu;
    private String competicio;
    private String club;

    // Constructor
    public Noticia(String titular, String text) {
        this.titular = titular;
        this.text = text;
    }

    public Noticia(String titular, String text, String competicio) {
        this.titular = titular;
        this.text = text;
        this.competicio = competicio;
    }

    public Noticia(String titular, String text, String competicio, String club) {
        this.titular = titular;
        this.text = text;
        this.competicio = competicio;
        this.club = club;
    }

    // Getters
    public String getTitular() {
        return this.titular;
    }

    public String getText() {
        return this.text;
    }

    public int getPuntuacio() {
        return this.puntuacio;
    }

    public int getPreu() {
        return this.preu;
    }

    public String getCompeticio() {
        return this.competicio;
    }

    public String getClub() {
        return this.club;
    }

    // Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public void setClub(String club) {
        this.club = club;
    }

    // metode especific
    public abstract int calculPreu();

    public abstract int calculPuntuacio();

    // metodes propis
    public String toString() {
        return "Noticia [titular=" + this.titular + ", text=" + this.text + "]";
    }


}