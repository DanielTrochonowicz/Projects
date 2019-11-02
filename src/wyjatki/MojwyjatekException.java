package wyjatki;

public class MojwyjatekException extends Exception {

    public MojwyjatekException() {
    }

    public MojwyjatekException(String message) {
        super(message);
    }

    public MojwyjatekException(String messege, Throwable cause) {
        super(messege, cause);
    }
}
