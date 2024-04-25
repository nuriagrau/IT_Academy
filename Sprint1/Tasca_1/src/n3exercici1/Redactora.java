package n3exercici1;

import java.util.ArrayList;

public class Redactora {
    private String nom;
    private String dni;
    final private int SOU = 1500;
    private ArrayList<Noticia> noticies;

    public Redactora(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
        this.noticies = new ArrayList<Noticia>();
    }

    public String getNom() {
        return this.nom;
    }

    public String getDni() {
        return this.dni;
    }

    public int getSou() {
        return this.SOU;
    }

    public ArrayList<Noticia> getNoticies() {
        return noticies;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void afegirNoticia(Noticia noticia) {
        this.noticies.add(noticia);
    }

    public boolean eliminarNoticia(int indexNoticia) {
        boolean noticiaEliminada = false;
        if (this.noticies.get(indexNoticia).equals(this.noticies.remove(indexNoticia))) {
            noticiaEliminada = true;
        }
        return noticiaEliminada;
    }
    public int indexNoticia(String titular) {
        int indexNoticia = -1;
        if (this.noticies.size() > 0) {
            for (int i = 0; i < this.noticies.size(); i++) {
                if (this.noticies.get(i).getTitular().equalsIgnoreCase(titular)) {
                    indexNoticia = i;
                }
            }
        } return indexNoticia;
    }

    public String mostrarNoticiesRedactor() {
        String noticiesRedactor = "";
        if (this.noticies.size() == 0) {
            noticiesRedactor = "Aquest redactor no té notícies per mostrar\n";
        } else {
            for (Noticia noticia : this.noticies) {
                if (noticia instanceof Futbol) {
                    Futbol noticiaFutbol = (Futbol) noticia;
                    noticiesRedactor += noticiaFutbol.toString() + "\n";
                } else if (noticia instanceof Basquet) {
                    Basquet noticiaBasquet = (Basquet) noticia;
                    noticiesRedactor += noticiaBasquet.toString() + "\n";
                } else if (noticia instanceof Tenis) {
                    Tenis noticiaTenis = (Tenis) noticia;
                    noticiesRedactor += noticiaTenis.toString() + "\n";
                } else if (noticia instanceof F1) {
                    F1 noticiaF1 = (F1) noticia;
                    noticiesRedactor += noticiaF1.toString() + "\n";
                } else if (noticia instanceof Motociclisme) {
                    Motociclisme noticiaMotociclisme = (Motociclisme) noticia;
                    noticiesRedactor += noticiaMotociclisme.toString() + "\n";
                }
            }
        }
        return noticiesRedactor;
    }
}
