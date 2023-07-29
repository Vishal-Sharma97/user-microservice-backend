package com.buddy.logic.user.exception;

import com.buddy.logic.user.exception.format.ErrorCode;
import com.buddy.logic.user.exception.format.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = NoSuchUserExistsException.class)
    public ResponseEntity<ErrorResponse> handleNoSuchUserExistsException(NoSuchUserExistsException e) {
        ErrorResponse error =  ErrorResponse.builder()
                .errorCode(ErrorCode.ERR_NO_DATA_EXISTS)
                .errorDescription(e.getMessage())
                .build();
        return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
    }

    @ExceptionHandler(value = UserAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleUserAlreadyExistsException(UserAlreadyExistsException e) {
        ErrorResponse error =  ErrorResponse.builder()
                .errorCode(ErrorCode.ERR_DATA_ALREADY_EXISTS)
                .errorDescription(e.getMessage())
                .build();
        return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
    }
}
