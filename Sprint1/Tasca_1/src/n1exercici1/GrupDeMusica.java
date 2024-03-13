package n1exercici1;
public class GrupDeMusica {
    public static void main(String[] args) {
        System.out.println("El material dels instruments de la classe Vent es " +  Vent.material);

        Vent instrument1 = new Vent("saxo", 12000);
        System.out.println(instrument1.tocar());

        Corda instrument2 = new Corda("guitarra acústica", 6000);
        System.out.println(instrument2.tocar());

        System.out.println("El numero de cordes dels instruments de corda es de " + Corda.numeroCordes);

        Percussio instrument4 = new Percussio("bongo", 3000);
        System.out.println(instrument4.tocar());

        System.out.println((new Percussio("bateria", 15000)).tocar());

        System.out.println("El nombre de percussors dels instruments de percussió es de " + Percussio.nombreDePercussors);

        System.out.println((new Corda("ukelele", 25)).tocar());


    }
}
