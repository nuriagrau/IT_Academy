package n3exercici1;

public abstract class Noticia {
    protected String titular;
    protected String text;
    protected int puntuacio;

    protected int preu;
    protected String competicio;
    protected String club;

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

    public abstract int calculPreu();

    public abstract int calculPuntuacio();

    @Override
    public String toString() {
        return "Noticia [titular=" + this.titular + ", text=" + this.text + "]";
    }


}