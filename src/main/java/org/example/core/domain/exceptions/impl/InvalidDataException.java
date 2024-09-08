package org.example.core.domain.exceptions.impl;

import org.example.core.domain.exceptions.CustomException;

public class InvalidDataException extends CustomException {

    //<editor-fold desc="======== Constructors ========">
    public InvalidDataException(String message) {
        super(message);
    }

    public InvalidDataException(String message, boolean printStackTrace) {
        super(message, printStackTrace);
    }

    public InvalidDataException(String message, Throwable cause, boolean printStackTrace) {
        super(message, cause, printStackTrace);
    }

    public InvalidDataException(String message, Throwable cause, boolean enableSuppression, boolean printStackTrace) {
        super(message, cause, enableSuppression, printStackTrace);
    }
    //</editor-fold>
}
