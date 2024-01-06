package com.mentor.v1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;
//to apply it in all of your controllers or across you entire application
@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = ApiRequestExcpetion.class)
    public ResponseEntity<Object> handleApiRequestException(ApiRequestExcpetion a){
        ApiException apiException = new ApiException(a.getMessage(), a, HttpStatus.BAD_REQUEST, ZonedDateTime.now());

     return new ResponseEntity<>(apiException,HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(value = ApiNotFoundException.class)
    public ResponseEntity<Object> handleApiApiNotFoundException(ApiNotFoundException a){
        ApiException apiException = new ApiException(a.getMessage(), a, HttpStatus.NOT_FOUND, ZonedDateTime.now());

        return new ResponseEntity<>(apiException,HttpStatus.NOT_FOUND);

    }

}
