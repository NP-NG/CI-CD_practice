package com.example.feed.domain.user.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017J\u0012\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017J\u0012\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u000b\u001a\u00020\u0012H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/feed/domain/user/presentation/UserController;", "", "signUpService", "Lcom/example/feed/domain/user/service/SignUpService;", "signInService", "Lcom/example/feed/domain/user/service/SignInService;", "tokenReissueService", "Lcom/example/feed/domain/user/service/TokenReissueService;", "(Lcom/example/feed/domain/user/service/SignUpService;Lcom/example/feed/domain/user/service/SignInService;Lcom/example/feed/domain/user/service/TokenReissueService;)V", "login", "Lcom/example/feed/domain/user/presentation/dto/response/TokenResponse;", "request", "Lcom/example/feed/domain/user/presentation/dto/request/SignInRequest;", "reissue", "token", "", "signup", "", "Lcom/example/feed/domain/user/presentation/dto/request/SignUpRequest;", "feed"})
@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping(value = {"/users"})
public class UserController {
    private final com.example.feed.domain.user.service.SignUpService signUpService = null;
    private final com.example.feed.domain.user.service.SignInService signInService = null;
    private final com.example.feed.domain.user.service.TokenReissueService tokenReissueService = null;
    
    public UserController(@org.jetbrains.annotations.NotNull
    com.example.feed.domain.user.service.SignUpService signUpService, @org.jetbrains.annotations.NotNull
    com.example.feed.domain.user.service.SignInService signInService, @org.jetbrains.annotations.NotNull
    com.example.feed.domain.user.service.TokenReissueService tokenReissueService) {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/signup"})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
    public void signup(@org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    @org.springframework.web.bind.annotation.RequestBody
    com.example.feed.domain.user.presentation.dto.request.SignUpRequest request) {
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {"/login"})
    public com.example.feed.domain.user.presentation.dto.response.TokenResponse login(@org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    @org.springframework.web.bind.annotation.RequestBody
    com.example.feed.domain.user.presentation.dto.request.SignInRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PutMapping(value = {"/reissue"})
    public com.example.feed.domain.user.presentation.dto.response.TokenResponse reissue(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestHeader(value = "x-refresh-token")
    java.lang.String token) {
        return null;
    }
}