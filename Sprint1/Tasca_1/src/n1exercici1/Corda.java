package n1exercici1;
public class Corda extends Instrument{
    {
        System.out.println("Aquest és el bloc d'inicialització d'instàncies de la classe Corda i s'executa a cada instància.");
    }

    static int numeroCordes = 5;

    // Constructor
    public Corda(String nom, int preu) {
        super(nom, preu);
        System.out.println("S'ha cridat al constructor de la classe Corda per a un " + super.getNom() + " que val " + super.getPreu() + " euros.");
    }

    // metode abstracte
    public String tocar() {
        return "Està sonant un instrument de corda";
    }
    // Bloc estàtic, pot estar a qualsevol lloc dins de la classe
    static {
        System.out.println("Aquest és el block estàtic de la classe Corda i només s'executa un cop, durant el procés de càrrega de la classe.");
    }
}
