package dev.sytnikov.java_backend.error_handlers;

public class CustomException extends RuntimeException{
    public CustomException(String message) {
        super(message);
    }
}
