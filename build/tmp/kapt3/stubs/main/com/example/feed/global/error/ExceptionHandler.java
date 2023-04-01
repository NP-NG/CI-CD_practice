package com.example.feed.global.error;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\nH\u0017\u00a8\u0006\u000b"}, d2 = {"Lcom/example/feed/global/error/ExceptionHandler;", "", "()V", "customException", "Lorg/springframework/http/ResponseEntity;", "Lcom/example/feed/global/error/response/BaseErrorResponse;", "e", "Lcom/example/feed/global/error/exception/CustomException;", "validException", "Lcom/example/feed/global/error/response/ValidationErrorResponse;", "Lorg/springframework/web/bind/MethodArgumentNotValidException;", "feed"})
@org.springframework.web.bind.annotation.RestControllerAdvice
public class ExceptionHandler {
    
    public ExceptionHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {com.example.feed.global.error.exception.CustomException.class})
    public org.springframework.http.ResponseEntity<com.example.feed.global.error.response.BaseErrorResponse> customException(@org.jetbrains.annotations.NotNull
    com.example.feed.global.error.exception.CustomException e) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {org.springframework.web.bind.MethodArgumentNotValidException.class})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.BAD_REQUEST)
    public com.example.feed.global.error.response.ValidationErrorResponse validException(@org.jetbrains.annotations.NotNull
    org.springframework.web.bind.MethodArgumentNotValidException e) {
        return null;
    }
}