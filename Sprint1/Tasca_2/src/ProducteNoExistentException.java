public class ProducteNoExistentException extends Exception{
    private String message;

    ProducteNoExistentException() {}

    ProducteNoExistentException(String message) {
        this.message = message;
    }

    public String getMessage(String message) {
        return this.message;
    }

}
