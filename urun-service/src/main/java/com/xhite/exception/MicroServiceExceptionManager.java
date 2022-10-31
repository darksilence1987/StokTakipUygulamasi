package com.xhite.exception;

import lombok.Getter;
@Getter
public class MicroServiceExceptionManager extends RuntimeException{
    private final ErrorType errorType;
    public MicroServiceExceptionManager(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }
    public MicroServiceExceptionManager(ErrorType errorType, String message){
        super(message);
        this.errorType = errorType;
    }
}