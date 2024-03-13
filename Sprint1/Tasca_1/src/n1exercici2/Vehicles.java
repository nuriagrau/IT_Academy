package n1exercici2;
public class Vehicles {
    public static void main(String[] args) {
        // El metode estàtic es pot invocar sense crear un nou objecte
        Cotxe.frenar();

        // El mètode no estàtic necessita un objecte des del qual ser invocat
        Cotxe nouToyota = new Cotxe("Prius");
        nouToyota.accelerar();
        // El mètode estàtic pot ser cridat també des d'un objecte
        nouToyota.frenar();
    }
}