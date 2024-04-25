package n1exercici1;
public class Percussio extends Instrument{
    static int nombreDePercussors = 2;

    static {
        System.out.println("Aquest és el PRIMER block estàtic de la classe Percussió i només s'executa un cop, durant el procés de càrrega de la classe.");
    }

    {
        System.out.println("Aquest és el bloc d'inicialització d'instàncies de la classe Percussió i s'executa a cada instància.");
    }

    public Percussio(String nom, int preu) {
        super(nom, preu);
        System.out.println("S'ha cridat al constructor de la classe Percussió per a un " + super.getNom() + " que val " + super.getPreu() + " euros.");
    }

    @Override
    public String tocar() {
        return "Està sonant un instrument de percussió";
    }


    static {
        System.out.println("Aquest és el SEGON block estàtic de la classe Percussió i només s'executa un cop, durant el procés de càrrega de la classe.");
    }
}
