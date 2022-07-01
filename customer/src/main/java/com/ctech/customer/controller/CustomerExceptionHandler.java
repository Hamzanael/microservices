package com.ctech.customer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class CustomerExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Exception> exceptionResponseEntity(Exception exception) {
        log.error("error in request ", exception);
        return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);
    }

}
