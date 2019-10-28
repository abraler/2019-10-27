public class usernotException extends Exception{
    public usernotException() {
    }

    public usernotException(String message) {
        super(message);
    }

    public usernotException(String message, Throwable cause) {
        super(message, cause);
    }

    public usernotException(Throwable cause) {
        super(cause);
    }

    public usernotException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
