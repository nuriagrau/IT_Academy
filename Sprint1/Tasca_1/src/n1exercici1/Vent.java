package n1exercici1;
public class Vent extends Instrument {
    //// Block d'inicilització d'instància (Instance Initialization Block)
    {
        System.out.println("Aquest és el bloc d'inicialització d'instàncies de la classe Vent i s'executa a cada instància.");
    }

    static String material = "metall";

    // Bloc estàtic, pot estar a qualsevol lloc dins de la classe
    static {
        System.out.println("Aquest és el block estàtic de la classe Vent que s'executa només un cop, durant el procés de càrrega de la classe.");
    }
    // Constructor
    public Vent(String nom, int preu) {
        super(nom, preu);
        System.out.println("S'ha cridat al constructor de la classe Vent per a un "  + super.getNom() + " que val " + super.getPreu() + " euros.");
    }
    // metode abstracte
    public String tocar() {
        return "Està sonant un instrument de vent";
    }

}
