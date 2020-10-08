package com.challenge.cubistic;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class JsonNotParsableAdvice {

    @ResponseBody
    @ExceptionHandler(JsonNotParsableException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "400")
    String transactionNotFoundHandler(JsonNotParsableException ex) {
        return ex.getMessage();
    }
}


/*
@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "CUSTOM MESSAGE HERE")
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public void handleException() {
        //Handle Exception Here...
    }
 */