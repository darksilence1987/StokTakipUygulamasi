package com.xhite.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {
    USER_CAN_NOT_BE_CREATED_USERNAME_ALREADY_EXIST(1001,"New user can not be created because an user with specified user name already exist", HttpStatus.INTERNAL_SERVER_ERROR),
    USERNAME_CAN_NOT_BE_FOUND(2001,"Login failed. Username does not exist.", HttpStatus.INTERNAL_SERVER_ERROR),
    INCORRECT_PASSWORD_LOGIN_FAILED(2002,"Login failed. Username and password does not match.", HttpStatus.INTERNAL_SERVER_ERROR);
    private int code;
    private String message;
    private HttpStatus status;
}