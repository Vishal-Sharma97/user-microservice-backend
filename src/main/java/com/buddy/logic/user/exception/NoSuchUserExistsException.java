package com.buddy.logic.user.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NoSuchUserExistsException extends RuntimeException{

    private String message;
}
