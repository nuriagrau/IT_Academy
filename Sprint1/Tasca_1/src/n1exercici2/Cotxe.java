package n1exercici2;
public class Cotxe {
    // Atributs
    private static final String MARCA = "TOYOTA";
    private static String model;

    static {
        model = "Prius";
    }
    private final int POTENCIA = 130;

    public Cotxe() {
    }

    public String getMarca() {
        return this.MARCA;
    }

    public String getModel() {
        return this.model;
    }

    public int getPOTENCIA() {
        return this.POTENCIA;
    }


    public static void frenar() {
        System.out.println("El vehicle està frenant");
    }

    public void accelerar() {
        System.out.println("El vehicle està accelerant");
    }
}

