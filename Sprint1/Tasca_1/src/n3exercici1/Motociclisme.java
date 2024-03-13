package n3exercici1;
public class Motociclisme extends Noticia{
    private String equip;
    final private int PREU_INICIAL = 100;
    final private int PUNTS_INICIALS = 3;
    public Motociclisme(String titular, String text, String equip) {
        super(titular, text);
        this.equip = equip;
    }

    public String getEquip() {
        return this.equip;
    }

    public void setEquip(String equip) {
        this.equip = equip;
    }

    public int calculPreu() {
        int preuNoticia = PREU_INICIAL;
        if (this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha")) {
            preuNoticia += 50;
        }
        return preuNoticia;
    }

    public int calculPuntuacio() {
        int puntuacioNoticia = PUNTS_INICIALS;
        if (this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha")) {
            puntuacioNoticia += 3;
        }
        return puntuacioNoticia;
    }

    public String toString() {
        return "Noticia de Motociclisme [titular=" + super.getTitular() + ", text=" + super.getText() + ", equip=" + this.equip + ", preu notícia=" + this.calculPreu() + ", puntuació notícia" + this.calculPuntuacio() + "]";
    }
}