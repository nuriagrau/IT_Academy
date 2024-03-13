package n1exercici1;
public class Percussio extends Instrument{
    static int nombreDePercussors = 2;

    // Bloc estàtic, pot estar a qualsevol lloc dins de la classe
    static {
        System.out.println("Aquest és el PRIMER block estàtic de la classe Percussió i només s'executa un cop, durant el procés de càrrega de la classe.");
    }
    // Block d'inicialització de l'instància (Instance Initialization Block)
    {
        System.out.println("Aquest és el bloc d'inicialització d'instàncies de la classe Percussió i s'executa a cada instància.");
    }
    // Constructor
    public Percussio(String nom, int preu) {
        super(nom, preu);
        System.out.println("S'ha cridat al constructor de la classe Percussió per a un " + super.getNom() + " que val " + super.getPreu() + " euros.");
    }

    // metode abstracte
    public String tocar() {
        return "Està sonant un instrument de percussió";
    }

    // Bloc estàtic, pot estar a qualsevol lloc dins de la classe
    static {
        System.out.println("Aquest és el SEGON block estàtic de la classe Percussió i només s'executa un cop, durant el procés de càrrega de la classe.");
    }
}
