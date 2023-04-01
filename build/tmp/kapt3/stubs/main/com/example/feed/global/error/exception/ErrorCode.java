package com.example.feed.global.error.exception;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/example/feed/global/error/exception/ErrorCode;", "", "Lcom/example/feed/global/error/response/ErrorResponse;", "status", "", "message", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getStatus", "()I", "EXPIRED_TOKEN", "INVALID_TOKEN", "INVALID_PASSWORD", "USER_MISMATCH", "USER_NOT_FOUND", "FEED_NOT_FOUND", "USER_ALREADY_EXISTS", "INTERNAL_SERVER_ERROR", "feed"})
public enum ErrorCode implements com.example.feed.global.error.response.ErrorResponse {
    /*public static final*/ EXPIRED_TOKEN /* = new EXPIRED_TOKEN(0, null) */,
    /*public static final*/ INVALID_TOKEN /* = new INVALID_TOKEN(0, null) */,
    /*public static final*/ INVALID_PASSWORD /* = new INVALID_PASSWORD(0, null) */,
    /*public static final*/ USER_MISMATCH /* = new USER_MISMATCH(0, null) */,
    /*public static final*/ USER_NOT_FOUND /* = new USER_NOT_FOUND(0, null) */,
    /*public static final*/ FEED_NOT_FOUND /* = new FEED_NOT_FOUND(0, null) */,
    /*public static final*/ USER_ALREADY_EXISTS /* = new USER_ALREADY_EXISTS(0, null) */,
    /*public static final*/ INTERNAL_SERVER_ERROR /* = new INTERNAL_SERVER_ERROR(0, null) */;
    private final int status = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String message = null;
    
    ErrorCode(int status, java.lang.String message) {
    }
    
    @java.lang.Override
    public int getStatus() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getMessage() {
        return null;
    }
}