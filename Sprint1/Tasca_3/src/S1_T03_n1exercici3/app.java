package S1_T03_n1exercici3;

import java.io.*;
import java.util.*;

public class app {
    static String nomUsuari = "", country = "", capital = "", classificacio = "";

    final static int PLAYS = 10;
    static Scanner scanner = new Scanner(System.in);
    static HashMap<String, String> map = new HashMap<>();
    static ArrayList<String> countries = new ArrayList<>();

    public static void iniciarConcurs() {
        nomUsuari = getInputUser("Introdueix el nom d'usuari/a per iniciar el concurs: ", nomUsuari);
        uploadCountries();
        classificacio = nomUsuari + " : " +  compete() + "\n";
        System.out.println(writeClassification(classificacio));
    }

    public static String getInputUser(String request, String dada) {
        System.out.println(request);
        return scanner.next();
    }

    public static void uploadCountries() {

        File csvFile = new File("Sprint1/Tasca_3/src/S1_T03_n1exercici3/countries.txt");

        try (Scanner fileScanner = new Scanner(csvFile)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                try (Scanner rowScanner = new Scanner(line)) {
                    while (rowScanner.hasNext()) {
                        country = rowScanner.next();
                        capital = rowScanner.next();
                        map.put(country, capital);
                        countries.add(country);
                    }
                } catch (NoSuchElementException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static int compete() {
        String resposta = "";
        int punctuation = 0;
        int answersCounter = 0;

        List<Integer> rightAnswered = new ArrayList<Integer>();

        while (answersCounter < PLAYS) {
            int play = (int) (Math.random() * map.size()) + 1;
            if (!rightAnswered.contains(play)) {
                resposta = getInputUser("Quina és la capital de: " + countries.get(play), resposta);
                answersCounter++;
                if (map.get(countries.get(play)).equalsIgnoreCase(resposta)) {
                    rightAnswered.add(play);
                    punctuation++;
                }
            }
        } return punctuation;
    }

    public static String writeClassification(String classificacio) {
        String message = "";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Sprint1/Tasca_3/src/S1_T03_n1exercici3/classificacio.txt", true));
            writer.write(classificacio);
            writer.close();
            message = classificacio + "Aquesta classificació s'ha escrit correctament al fitxer classificacio.txt" + "\n";

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return message;
    }

}
