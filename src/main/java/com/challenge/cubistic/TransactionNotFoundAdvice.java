package com.challenge.cubistic;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class TransactionNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(TransactionsNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String transactionNotFoundHandler(TransactionsNotFoundException ex) {
        return ex.getMessage();
    }
}