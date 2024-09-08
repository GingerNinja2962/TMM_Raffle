package org.example.core.domain.exceptions;

public abstract class CustomException extends Exception {

    public CustomException(String message) {
        super(message, null, false, false);
    }

    public CustomException(String message, boolean printStackTrace) {
        super(message, null, false, printStackTrace);
    }

    public CustomException(String message, Throwable cause, boolean printStackTrace) {
        super(message, cause, false, printStackTrace);
    }

    public CustomException(String message, Throwable cause, boolean enableSuppression, boolean printStackTrace) {
        super(message, cause, enableSuppression, printStackTrace);
    }
}
