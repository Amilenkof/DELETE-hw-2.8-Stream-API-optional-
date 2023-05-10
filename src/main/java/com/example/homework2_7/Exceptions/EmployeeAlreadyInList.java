package com.example.homework2_7.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class EmployeeAlreadyInList extends RuntimeException {
    public EmployeeAlreadyInList(String message) {
        super(message);
    }
}
