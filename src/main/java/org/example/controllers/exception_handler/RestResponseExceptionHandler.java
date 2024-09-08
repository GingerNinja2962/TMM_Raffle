package org.example.controllers.exception_handler;

import org.example.core.domain.exceptions.CustomException;
import org.example.core.domain.exceptions.impl.InvalidDataException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseExceptionHandler extends ResponseEntityExceptionHandler {

    // TODO add more exception handling methods for different exceptions

    @ExceptionHandler(value =
            {IllegalArgumentException.class, IllegalStateException.class})
    protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {

        // TODO do impl of exception handling
        String bodyOfResponse = ex.getMessage();
        HttpHeaders headers = new HttpHeaders();
        HttpStatus status = HttpStatus.CONFLICT;
        return handleExceptionInternal(ex, bodyOfResponse, headers, status, request);
    }

    @ExceptionHandler(value =
            {InvalidDataException.class})
    protected ResponseEntity<Object> handleConflict(CustomException ex, WebRequest request) {
        String bodyOfResponse = ex.getMessage();
        HttpHeaders headers = new HttpHeaders();
        HttpStatus status = HttpStatus.BAD_REQUEST;
        return handleExceptionInternal(ex, bodyOfResponse, headers, status, request);
    }
}
