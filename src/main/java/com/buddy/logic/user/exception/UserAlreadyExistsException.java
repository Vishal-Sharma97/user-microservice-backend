package com.buddy.logic.user.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserAlreadyExistsException extends RuntimeException{

    private String message;
}
