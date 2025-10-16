package lang;

// Exception : 컴파일 예외 발생
// RuntimeException : 실행 시 예외 발생
public class BalaceInsufficientException extends Exception {
    public BalaceInsufficientException() {
    }

    public BalaceInsufficientException(String message) {
        super(message);
    }

}
