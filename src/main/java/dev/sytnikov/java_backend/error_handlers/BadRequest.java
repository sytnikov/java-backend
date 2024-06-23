package dev.sytnikov.java_backend.error_handlers;

public class BadRequest extends CustomException {
    public BadRequest(String message) {
        super(message);
    }
}
