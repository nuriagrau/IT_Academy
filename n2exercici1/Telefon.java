public class Telefon {
    // Atributs
    private String marca;
    private String model;


    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    // Getters
    public String getMarca() {
        return this.marca;
    }

    public String getModel() {
        return this.model;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Mètodes específics
    public void trucar(String numeroTelefon) {
        System.out.println("S'està trucant al numero " + numeroTelefon);
    }

    // Mètodes propis

}
