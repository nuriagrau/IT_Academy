class VendaBuidaException extends Exception{
    private String message;
    // Llança excepcio personalitzada VendaBuidaException
    // Excepcio ArrayIndexOutOfBoundsException
    //Throw Excepcion:"Per fer una venda primer has d'afegir productes" if productes isEmpty
    VendaBuidaException() {}
    VendaBuidaException(String message) {
        //getMessage()
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
