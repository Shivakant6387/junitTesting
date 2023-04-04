package com.example.junitTestSpringBoot.advice;

import com.example.junitTestSpringBoot.exception.EmployeeException;
import com.example.junitTestSpringBoot.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class ResourceNotFoundExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Object> handlerCloudVendorNotFoundException(ResourceNotFoundException resourceNotFoundException) {
        EmployeeException employeeException = new EmployeeException(
                resourceNotFoundException.getMessage(), resourceNotFoundException.getCause(), HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(employeeException, HttpStatus.NOT_FOUND);
    }
}
