package n3exercici1;
public class Tenis extends Noticia{

    private String tenista;
    final private int PREU_INICIAL = 150;
    final private int PUNTS_INICIALS = 4;

    public Tenis(String titular, String text, String tenista) {
        super(titular, text);
        this.tenista = tenista;
    }

    public String getTenista() {
        return this.tenista;
    }

    public void setTenista(String tenista) {
        this.tenista = tenista;
    }

    @Override
    public int calculPreu() {
        int preuNoticia = PREU_INICIAL;
        if (this.tenista.equalsIgnoreCase("Federer") || this.tenista.equalsIgnoreCase("Nadal") || this.tenista.equalsIgnoreCase("Djokovik") ) {
            preuNoticia += 100;
        }
        return preuNoticia;
    }

    @Override
    public int calculPuntuacio() {
        int puntuacioNoticia = PUNTS_INICIALS;
        if (this.tenista.equalsIgnoreCase("Federer") || this.tenista.equalsIgnoreCase("Nadal") || this.tenista.equalsIgnoreCase("Djokovik") ) {
            puntuacioNoticia += 3;
        }
        return puntuacioNoticia;
    }

    @Override
    public String toString() {
        return "Noticia de Tenis [titular=" + super.getTitular() + ", text=" + super.getText() + ", tenista=" + this.tenista + ", preu notícia=" + this.calculPreu() + ", puntuació notícia=" + this.calculPuntuacio() + "]";
    }
}
