package com.example.feed.global.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0015J\b\u0010\u000b\u001a\u00020\fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/feed/global/security/SecurityConfig;", "", "jwtTokenProvider", "Lcom/example/feed/global/security/jwt/JwtTokenProvider;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lcom/example/feed/global/security/jwt/JwtTokenProvider;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "filterChain", "Lorg/springframework/security/web/SecurityFilterChain;", "http", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "feed"})
@org.springframework.context.annotation.Configuration
@org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
public class SecurityConfig {
    private final com.example.feed.global.security.jwt.JwtTokenProvider jwtTokenProvider = null;
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    
    public SecurityConfig(@org.jetbrains.annotations.NotNull
    com.example.feed.global.security.jwt.JwtTokenProvider jwtTokenProvider, @org.jetbrains.annotations.NotNull
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    protected org.springframework.security.web.SecurityFilterChain filterChain(@org.jetbrains.annotations.NotNull
    org.springframework.security.config.annotation.web.builders.HttpSecurity http) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public org.springframework.security.crypto.password.PasswordEncoder passwordEncoder() {
        return null;
    }
}