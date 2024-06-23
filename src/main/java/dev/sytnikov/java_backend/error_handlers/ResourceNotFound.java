package dev.sytnikov.java_backend.error_handlers;

public class ResourceNotFound extends CustomException{
    public ResourceNotFound(String message) {
        super(message);
    }
}
