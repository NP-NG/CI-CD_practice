package com.example.feed.global.security.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/feed/global/security/auth/AuthDetailsService;", "Lorg/springframework/security/core/userdetails/UserDetailsService;", "userRepository", "Lcom/example/feed/domain/user/domain/repository/UserRepository;", "(Lcom/example/feed/domain/user/domain/repository/UserRepository;)V", "loadUserByUsername", "Lorg/springframework/security/core/userdetails/UserDetails;", "accountId", "", "feed"})
@org.springframework.stereotype.Component
public class AuthDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    private final com.example.feed.domain.user.domain.repository.UserRepository userRepository = null;
    
    public AuthDetailsService(@org.jetbrains.annotations.NotNull
    com.example.feed.domain.user.domain.repository.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(@org.jetbrains.annotations.NotNull
    java.lang.String accountId) {
        return null;
    }
}