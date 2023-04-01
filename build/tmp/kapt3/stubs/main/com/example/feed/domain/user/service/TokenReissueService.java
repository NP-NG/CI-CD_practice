package com.example.feed.domain.user.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/feed/domain/user/service/TokenReissueService;", "", "refreshTokenJpaRepository", "Lcom/example/feed/domain/user/domain/repository/RefreshTokenJpaRepository;", "jwtTokenProvider", "Lcom/example/feed/global/security/jwt/JwtTokenProvider;", "jwtProperties", "Lcom/example/feed/global/security/jwt/JwtProperties;", "(Lcom/example/feed/domain/user/domain/repository/RefreshTokenJpaRepository;Lcom/example/feed/global/security/jwt/JwtTokenProvider;Lcom/example/feed/global/security/jwt/JwtProperties;)V", "execute", "Lcom/example/feed/domain/user/presentation/dto/response/TokenResponse;", "token", "", "feed"})
@org.springframework.stereotype.Service
public class TokenReissueService {
    private final com.example.feed.domain.user.domain.repository.RefreshTokenJpaRepository refreshTokenJpaRepository = null;
    private final com.example.feed.global.security.jwt.JwtTokenProvider jwtTokenProvider = null;
    private final com.example.feed.global.security.jwt.JwtProperties jwtProperties = null;
    
    public TokenReissueService(@org.jetbrains.annotations.NotNull
    com.example.feed.domain.user.domain.repository.RefreshTokenJpaRepository refreshTokenJpaRepository, @org.jetbrains.annotations.NotNull
    com.example.feed.global.security.jwt.JwtTokenProvider jwtTokenProvider, @org.jetbrains.annotations.NotNull
    com.example.feed.global.security.jwt.JwtProperties jwtProperties) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.feed.domain.user.presentation.dto.response.TokenResponse execute(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
        return null;
    }
}