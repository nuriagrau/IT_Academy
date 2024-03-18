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
                    missatge = Botiga.crearProducte();
                    break;
                case 2:
                    missatge = Botiga.afegirProducte(venda);
                    System.out.println("Venda té ara els següents productes:" + venda.getProductes().toString());
                    break;
                case 3:
                    missatge = Botiga.calcularTotalVenda(venda);
                    break;
                case 4:
                    missatge = Botiga.provocarArrayIndexOutOfBounds();
                    break;
            }
            System.out.println(missatge);
        } while (opcio != 0);
    }
}
