package S1_02_n1exercici1;

class VendaBuidaException extends Exception{
    private String message;
    VendaBuidaException() {}
    VendaBuidaException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
