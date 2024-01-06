package com.mentor.v1.exception;

public class ApiRequestExcpetion extends RuntimeException{
    public ApiRequestExcpetion(String message) {
        super(message);
    }

    public ApiRequestExcpetion(String message, Throwable cause) {
        super(message, cause);
    }
}
