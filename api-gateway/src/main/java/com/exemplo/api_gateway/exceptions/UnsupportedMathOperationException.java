package com.exemplo.api_gateway.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public UnsupportedMathOperationException() {
    }

    public UnsupportedMathOperationException(String message) {
        super(message);
    }

    public UnsupportedMathOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedMathOperationException(Throwable cause) {
        super(cause);
    }

    public UnsupportedMathOperationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
