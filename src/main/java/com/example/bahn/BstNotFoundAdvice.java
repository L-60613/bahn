package com.example.bahn;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class BstNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(BstNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String bstNotFoundHandler(BstNotFoundException e) {
        return e.getMessage();
    }
}
