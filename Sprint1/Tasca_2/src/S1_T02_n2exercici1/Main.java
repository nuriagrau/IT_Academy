package S1_T02_n2exercici1;

import static S1_T02_n2exercici1.Entrada.*;

public class Main {

    public static void main(String[] args) {

        byte bt;
        int i;
        float fl;
        double db;
        char c;
        String string;
        boolean SiNo;

        bt = llegirByte("Introdueix un byte:");
        System.out.println("El teu byte és: " + bt + "\n");

        i = llegirInt("Introdueix un integer:");
        System.out.println("El teu int és: " + i + "\n");

        fl = llegirFloat("Introdueix un float:");
        System.out.println("El teu float és " + fl + "\n");

        db = llegirDouble("Introdueix un double:");
        System.out.println("El teu double és: " + db + "\n");

        c = llegirChar("Introdueix un char:");
        System.out.println("El teu char és: " + c + "\n");

        string = llegirString("Introdueix un String:");
        System.out.println("El teu String és: " + string + "\n");

        SiNo = llegirSiNo("Introdueix si o no?");
        System.out.println("La teva resposta és: " + SiNo + "\n");

    }
}
