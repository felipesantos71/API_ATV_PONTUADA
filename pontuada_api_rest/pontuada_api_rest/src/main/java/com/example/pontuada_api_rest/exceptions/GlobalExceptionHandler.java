package com.example.pontuada_api_rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>> handlerIllegalArgument(IllegalArgumentException erro){
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(Map.of("message", erro.getMessage()));
    }

    @ExceptionHandler(EmailJaCadastradoException.class)
    public ResponseEntity<Map<String, Object>> handlerEmailJaCadastrado(EmailJaCadastradoException erro){
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(Map.of("message", erro.getMessage()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> handlerMethodArgumentNotValid(MethodArgumentNotValidException erro){
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(Map.of("message", erro.getFieldErrors().get(0).getDefaultMessage()));
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<Map<String, Object>> handlerHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException erro){
        return ResponseEntity
                .status(HttpStatus.METHOD_NOT_ALLOWED)
                .body(Map.of("message", erro.getMessage()));
    }
}
