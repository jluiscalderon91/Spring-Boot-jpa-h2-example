package com.javabydeveloper.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TipoCambioNotFoundException extends RuntimeException{
    public TipoCambioNotFoundException(String message) {
        super(message);
    }
}
