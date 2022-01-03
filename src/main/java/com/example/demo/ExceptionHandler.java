package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ExceptionHandler extends RuntimeException {
    public ExceptionHandler() {
        super();
    }
    public ExceptionHandler(String message, Throwable cause) {
        super(message, cause);
    }
    public ExceptionHandler(String message) {
        super(message);
    }
    public ExceptionHandler(Throwable cause) {
        super(cause);
    }
}
