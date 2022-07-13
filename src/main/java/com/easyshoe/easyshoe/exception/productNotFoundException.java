package com.easyshoe.easyshoe.exception;

public class productNotFoundException extends RuntimeException {
    public productNotFoundException(String message) {
        super(message);
    }
}
