package com.example.feed.domain.user.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/feed/domain/user/service/SignInService;", "", "userRepository", "Lcom/example/feed/domain/user/domain/repository/UserRepository;", "jwtTokenProvider", "Lcom/example/feed/global/security/jwt/JwtTokenProvider;", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "(Lcom/example/feed/domain/user/domain/repository/UserRepository;Lcom/example/feed/global/security/jwt/JwtTokenProvider;Lorg/springframework/security/crypto/password/PasswordEncoder;)V", "execute", "Lcom/example/feed/domain/user/presentation/dto/response/TokenResponse;", "request", "Lcom/example/feed/domain/user/presentation/dto/request/SignInRequest;", "feed"})
@org.springframework.stereotype.Service
public class SignInService {
    private final com.example.feed.domain.user.domain.repository.UserRepository userRepository = null;
    private final com.example.feed.global.security.jwt.JwtTokenProvider jwtTokenProvider = null;
    private final org.springframework.security.crypto.password.PasswordEncoder passwordEncoder = null;
    
    public SignInService(@org.jetbrains.annotations.NotNull
    com.example.feed.domain.user.domain.repository.UserRepository userRepository, @org.jetbrains.annotations.NotNull
    com.example.feed.global.security.jwt.JwtTokenProvider jwtTokenProvider, @org.jetbrains.annotations.NotNull
    org.springframework.security.crypto.password.PasswordEncoder passwordEncoder) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.transaction.annotation.Transactional
    public com.example.feed.domain.user.presentation.dto.response.TokenResponse execute(@org.jetbrains.annotations.NotNull
    com.example.feed.domain.user.presentation.dto.request.SignInRequest request) {
        return null;
    }
}