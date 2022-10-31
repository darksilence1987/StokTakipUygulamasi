package com.xhite.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {
    SOME_ERROR(1001,"Some error", HttpStatus.INTERNAL_SERVER_ERROR);
    private int code;
    private String message;
    private HttpStatus status;
}