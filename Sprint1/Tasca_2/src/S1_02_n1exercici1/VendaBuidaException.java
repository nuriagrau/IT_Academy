package S1_02_n1exercici1;

class VendaBuidaException extends Exception{
    private String message;// no cal
    VendaBuidaException() {}// no cal
    VendaBuidaException(String message) {
        this.message = message;
    }
    // super(message); s'agafa de la classe para
    @Override // no cal
    public String getMessage() {
        return this.message;
    } // no cal
}
