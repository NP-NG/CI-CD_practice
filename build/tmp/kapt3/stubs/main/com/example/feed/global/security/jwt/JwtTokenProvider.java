package com.example.feed.global.security.jwt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0012J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/feed/global/security/jwt/JwtTokenProvider;", "", "jwtProperties", "Lcom/example/feed/global/security/jwt/JwtProperties;", "refreshTokenJpaRepository", "Lcom/example/feed/domain/user/domain/repository/RefreshTokenJpaRepository;", "authDetailsService", "Lcom/example/feed/global/security/auth/AuthDetailsService;", "(Lcom/example/feed/global/security/jwt/JwtProperties;Lcom/example/feed/domain/user/domain/repository/RefreshTokenJpaRepository;Lcom/example/feed/global/security/auth/AuthDetailsService;)V", "generateAccessToken", "", "accountId", "generateRefreshToken", "generateToken", "type", "exp", "", "getAuthentication", "Lorg/springframework/security/core/Authentication;", "token", "getClaims", "Lio/jsonwebtoken/Claims;", "resolveToken", "httpServletRequest", "Ljavax/servlet/http/HttpServletRequest;", "feed"})
@org.springframework.stereotype.Component
public class JwtTokenProvider {
    private final com.example.feed.global.security.jwt.JwtProperties jwtProperties = null;
    private final com.example.feed.domain.user.domain.repository.RefreshTokenJpaRepository refreshTokenJpaRepository = null;
    private final com.example.feed.global.security.auth.AuthDetailsService authDetailsService = null;
    
    public JwtTokenProvider(@org.jetbrains.annotations.NotNull
    com.example.feed.global.security.jwt.JwtProperties jwtProperties, @org.jetbrains.annotations.NotNull
    com.example.feed.domain.user.domain.repository.RefreshTokenJpaRepository refreshTokenJpaRepository, @org.jetbrains.annotations.NotNull
    com.example.feed.global.security.auth.AuthDetailsService authDetailsService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String generateAccessToken(@org.jetbrains.annotations.NotNull
    java.lang.String accountId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String generateRefreshToken(@org.jetbrains.annotations.NotNull
    java.lang.String accountId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.springframework.security.core.Authentication getAuthentication(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.String resolveToken(@org.jetbrains.annotations.NotNull
    javax.servlet.http.HttpServletRequest httpServletRequest) {
        return null;
    }
    
    private java.lang.String generateToken(java.lang.String accountId, java.lang.String type, long exp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public io.jsonwebtoken.Claims getClaims(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
        return null;
    }
}