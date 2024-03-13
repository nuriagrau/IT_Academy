package n3exercici1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Redaccio {
    public static Scanner scanner = new Scanner(System.in);

    public static BufferedReader bfn = new BufferedReader(
            new InputStreamReader(System.in));
    static ArrayList<Redactora> redactors = new ArrayList<Redactora>();
    public static void main(String[] args) {

        int opcio = 0;
        String resposta = "";
        String nom = "";
        String dni = "";
        String titular = "";
        String text = "";
        String competicio = "";
        String club = "";
        String jugador = "";
        String tenista = "";
        String equip = "";
        String escuderia = "";
        int indexRedactora = -1;
        int indexNoticia = -1;
        int puntuacio = 0;
        int preu = 0;
        char tipusNoticia = 0;
        Noticia novaNoticia;

        do {
            System.out.println("Escull l'acció a realitzar:\n" +
                    "0. Sortir\n" +
                    "1. Introduir redactor/a\n" +
                    "2. Eliminar redactor/a\n" +
                    "3. Introduir notícia\n" +
                    "4. Eliminar notícia\n" +
                    "5. Mostrar totes les notícies per redactor/a\n" +
                    "6. Calcular puntuació de la notícia\n" +
                    "7. Calcular preu-notícia\n");

            opcio = scanner.nextInt();
            switch(opcio) {
                case 0:
                    resposta = "Adeu!\n";
                    break;
                case 1:
                    nom = getInputUser("Introdueix el nom del redactor/a:", nom);
                    indexRedactora = buscarRedactora(nom);
                    if (indexRedactora == -1) {
                        dni = getInputUser("Ara introdueix el seu dni:", dni);
                        resposta = introduirRedactora(nom, dni);
                    } else {
                        resposta = "Aquest redactor/a ja existeix\n";
                    }
                    break;
                case 2:
                    nom = getInputUser("Introdueix el nom del redactor/a que vols eliminar", nom);
                    indexRedactora = buscarRedactora(nom);
                    if (indexRedactora == -1) {
                        resposta = "El redactor/a " + nom + " no existeix.\n";
                    } else {
                        resposta = (eliminarRedactora(indexRedactora)? "El redactor/a " + nom + " s'ha eliminat correctament\n" : "Hi ha hagut algun problema al eliminar el redactor/a\n"  + nom + "\n");
                    }
                    break;
                case 3:
                    nom = getInputUser("Introdueix el nom del redactor/a al qual vols afegir la notícia:", nom);
                    indexRedactora = buscarRedactora(nom);
                    if (indexRedactora == -1) {
                        resposta = "Aquest redactor/a no existeix\n";
                    } else {
                        titular = getInputUserLine("Introdueix el titular de la notícia que vols crear: ", titular);
                        System.out.println(titular);
                        indexNoticia = redactors.get(indexRedactora).indexNoticia(titular);
                        if (indexNoticia == -1) {
                            text = getInputUserLine("Introdueix el text de la notícia:", text);
                            System.out.println(text);
                            tipusNoticia  = getInputUser("Escull el tipus de notícia que estás creant:\n" +
                                    "F. Fútbol\n" +
                                    "B. Bàsquet\n" +
                                    "T. Tenis\n" +
                                    "1. F1\n" +
                                    "M. Motociclisme\n", tipusNoticia);
                            switch(tipusNoticia) {
                                case 'F':
                                    competicio = getInputUser("Introdueix la competició:", competicio);
                                    club = getInputUser("Introdueix el club: ", club);
                                    jugador = getInputUser("Introdueix el jugador:", jugador);
                                    novaNoticia = new Futbol(titular, text, competicio, club, jugador);
                                    redactors.get(indexRedactora).afegirNoticia(novaNoticia);
                                    resposta = "La notícia de Fútbol s'ha afegit correctament\n";
                                    break;
                                case 'B':
                                    competicio = getInputUser("Introdueix la competició:", competicio);
                                    club = getInputUser("Introdueix el club:", club);
                                    novaNoticia = new Basquet(titular, text, competicio, club);
                                    redactors.get(indexRedactora).afegirNoticia(novaNoticia);
                                    resposta = "La notícia de Bàsquet s'ha afegit correctament\n";
                                    break;
                                case 'T':
                                    tenista = getInputUser("Introdueix el tenista:", club);
                                    novaNoticia = new Tenis(titular, text, tenista);
                                    redactors.get(indexRedactora).afegirNoticia(novaNoticia);
                                    resposta = "La notícia de Tenis s'ha afegit correctament\n";
                                    break;
                                case '1':
                                    escuderia = getInputUser("Introdueix l'escuderia':", competicio);
                                    novaNoticia = new F1(titular, text, escuderia);
                                    redactors.get(indexRedactora).afegirNoticia(novaNoticia);
                                    resposta = "La notícia de F1 s'ha afegit correctament\n";
                                    break;
                                case 'M':
                                    equip = getInputUser("Introdueix l'equip':\n", competicio);
                                    novaNoticia = new Motociclisme(titular, text, equip);
                                    redactors.get(indexRedactora).afegirNoticia(novaNoticia);
                                    resposta = "La notícia de Motociclisme s'ha afegit correctament\n";
                                    break;
                            }
                        } else {
                            resposta = "Aquesta notícia ja ha estat creada\n";
                        }
                    }
                    break;
                case 4:
                    nom = getInputUser("Introdueix el nom del redactor/a del qual vols eliminar la notícia:", nom);
                    indexRedactora = buscarRedactora(nom);
                    if (indexRedactora == -1) {
                        resposta = "Aquest redactor/a no existeix\n";
                    } else {
                        titular = getInputUserLine("Introdueix el titular de la notícia que vols eliminar:", titular);
                        indexNoticia = redactors.get(indexRedactora).indexNoticia(titular);
                        resposta = (redactors.get(indexRedactora).eliminarNoticia(indexNoticia))? "La noticia s'ha eliminat correctament\n" : "Hi ha hagut algun problema al eliminar la notícia\n";
                    }
                    break;
                case 5:
                    nom = getInputUser("Introdueix el nom del redactor/a del qual vols veure les notícies:", nom);
                    indexRedactora = buscarRedactora(nom);
                    if (indexRedactora == -1) {
                        resposta = "Aquest redactor/a no existeix\n";
                    } else {
                        resposta = redactors.get(indexRedactora).mostrarNoticiesRedactor();
                    }
                    break;
                case 6:
                    nom = getInputUser("Introdueix el nom del redactor/a:", nom);
                    indexRedactora = buscarRedactora(nom);
                    if (indexRedactora == -1) {
                        resposta = "Aquesta redactora no existeix\n";
                    } else {
                        titular = getInputUserLine("Introdueix el titular de la notícia de la qual vols calcular la puntuació:", titular);
                        indexNoticia = redactors.get(indexRedactora).indexNoticia(titular);
                        if (indexNoticia == -1) {
                            resposta = "Aquesta noticia no existeix\n";
                        } else {
                            puntuacio = redactors.get(indexRedactora).getNoticies().get(indexNoticia).calculPuntuacio();
                            resposta = "La notícia " + titular + " té " + puntuacio + " punts.\n";
                        }
                    }
                    break;
                case 7:
                    nom = getInputUser("Introdueix el teu del redactor/a::", nom);
                    indexRedactora = buscarRedactora(nom);
                    if (indexRedactora == -1) {
                        resposta = "Aquesta redactora no existeix\n";
                    } else {
                        titular = getInputUserLine("Introdueix el titular de la notícia de la qual vols calcular el preu:", titular);
                        indexNoticia = redactors.get(indexRedactora).indexNoticia(titular);
                        if (indexNoticia == -1) {
                            resposta = "Aquesta notícia no existeix\n";
                        } else {
                            preu = redactors.get(indexRedactora).getNoticies().get(indexNoticia).calculPreu();
                            resposta = "El preu de la notícia " + titular + " és de " + preu + " euros.\n";
                        }
                    }
                    break;
            }
            System.out.println(resposta);
        } while(opcio != 0);
    }

    public static String getInputUser(String solicitudDada, String dada) {
        String dadaUsuari  ="";
        System.out.println(solicitudDada);
        dadaUsuari = scanner.next();
        scanner.nextLine();
        return dadaUsuari;
    }

    public static String getInputUserLine(String solicitudDada, String dada) {
        String dadaUsuari = "";
        System.out.println(solicitudDada);
        dadaUsuari = scanner.nextLine();
        return dadaUsuari;
    }

    public static char getInputUser(String solicitudDada, char dada) {
        System.out.println(solicitudDada);
        return scanner.next().charAt(0);
    }

    public static String introduirRedactora(String nom, String dni) {
        String missatge = "";
        Redactora novaRedactora = new Redactora(nom, dni);
        if (novaRedactora != null) {
            redactors.add(novaRedactora);
            missatge = "El nou redactor/a " +  nom + " s'ha creat correctament\n";
        } else {
            missatge = "Hi ha hagut un problema al crear el nou redactor/a\n";
        }
        return missatge;
    }

    public static int buscarRedactora(String nom) {
        int indexRedactora = -1;
        if (redactors.size() > 0) {
            for (int i = 0; i < redactors.size(); i++) {
                if (redactors.get(i).getNom().equalsIgnoreCase(nom)) {
                    indexRedactora = i;
                }
            }
        }
        return indexRedactora;
    }

    public static boolean eliminarRedactora(int indexRedactora) {
        boolean redactoraEliminada = false;
        if (redactors.get(indexRedactora).equals(redactors.remove(indexRedactora))) {
            redactoraEliminada = true;
        }
        return redactoraEliminada;
    }

}
