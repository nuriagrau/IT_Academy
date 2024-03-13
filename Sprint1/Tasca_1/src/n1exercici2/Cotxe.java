package n1exercici2;
public class Cotxe {
    // Atributs
    private static final String MARCA = "TOYOTA";
    private static String model;
    private final int POTENCIA = 130;

    public Cotxe(String model) {
        // Només el model es pot inicialitzar al constructor, els finals s'han de declarar asignant un valor.
        this.model = model;
    }

    // Getter
    public String getMarca() {
        return this.MARCA;
    }

    public String getModel() {
        return this.model;
    }

    public int getPOTENCIA() {
        return this.POTENCIA;
    }

    // Setter
    public void setModel(String model) {
        this.model = model;
    }

    // mètodes específics
    public static void frenar() {
        System.out.println("El vehicle està frenant");
    }

    public void accelerar() {
        System.out.println("El vehicle està accelerant");
    }
}

