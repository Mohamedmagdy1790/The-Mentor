package com.mentor.v1.exception;



public class ApiNotFoundException extends RuntimeException{
    public ApiNotFoundException(String s) {
        super(s);
    }
}
