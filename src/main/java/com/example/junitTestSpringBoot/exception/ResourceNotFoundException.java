package com.example.junitTestSpringBoot.exception;

public class ResourceNotFoundException extends Throwable {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
