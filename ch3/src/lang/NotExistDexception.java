package lang;

public class NotExistDexception extends Exception {
    public NotExistDexception() {
    }

    public NotExistDexception(String message) {
        super(message);
    }
}
