package n3exercici1;
public class F1 extends Noticia{
    private String escuderia;
    final private int PREU_INICIAL = 100;
    final private int PUNTS_INICIALS = 4;

    public F1(String titular, String text, String escuderia) {
        super(titular, text);
        this.escuderia = escuderia;
    }

    public String getEscuderia() {
        return this.escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    @Override
    public int calculPreu() {
        int preuNoticia = PREU_INICIAL;
        if (this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")) {
            preuNoticia += 50;
        }
        return preuNoticia;
    }

    @Override
    public int calculPuntuacio() {
        int puntuacioNoticia = PUNTS_INICIALS;
        if (this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")) {
            puntuacioNoticia += 2;
        }
        return puntuacioNoticia;
    }

    @Override
    public String toString() {
        return "Noticia de F1 [titular=" + super.titular + ", text=" + super.text + ", escuderia=" + this.escuderia + ", preu notícia=" + this.calculPreu() + ", puntuació notícia=" + this.calculPuntuacio() + "]";
    }
}