package S1_02_n1exercici1;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {
        Venda venda = new Venda();
        int opcio = 0;
        String missatge = "";

        do {
            missatge = "";
            System.out.println("Quina operació vols realitzar: \n" +
                    "0. Sortir\n" +
                    "1. Crear producte\n" +
                    "2. Afegir producte a venda\n" +
                    "3. Calcular total venda\n" +
                    "4. Provocar excepció ArrayIndexOutOfBoundsException\n");
            opcio = scanner.nextInt();
            switch(opcio) {
                case 0:
                    missatge = "Gràcies per la seva visita\n";
                    break;
                case 1:
                    try {
                        missatge = Botiga.crearProducte();
                    } catch (ProducteExistentException e){
                        System.out.println(e.toString());
                    }
                    break;
                case 2:
                    try {
                        missatge = Botiga.afegirProducte(venda);
                    } catch(ProducteNoExistentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 3:
                    try {
                        missatge = Botiga.calcularTotalVenda(venda);
                    } catch (VendaBuidaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        missatge = Botiga.provocarArrayIndexOutOfBounds();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e);
                        missatge = "S'ha provocat un ArrayIndexOutOfBounds exception.\n";
                    }
                    break;
            }
            System.out.println(missatge);
        } while (opcio != 0);
    }
}
