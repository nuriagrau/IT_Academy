package S1_02_n1exercici1;

class ProducteExistentException extends Exception {
        private String message;
        // Empty constructor
       ProducteExistentException() {}
       ProducteExistentException(String message) {
            this.message = message;
        }
        @Override
        public String getMessage() {
            return message;
        }
}
