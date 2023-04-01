package com.example.feed.domain.user.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/feed/domain/user/domain/repository/UserRepository;", "", "userJpaRepository", "Lcom/example/feed/domain/user/domain/repository/UserJpaRepository;", "(Lcom/example/feed/domain/user/domain/repository/UserJpaRepository;)V", "existsUserByAccountId", "", "accountId", "", "queryUserByAccountId", "Lcom/example/feed/domain/user/domain/User;", "queryUserById", "id", "Ljava/util/UUID;", "saveUser", "user", "feed"})
@org.springframework.stereotype.Repository
public class UserRepository {
    private final com.example.feed.domain.user.domain.repository.UserJpaRepository userJpaRepository = null;
    
    public UserRepository(@org.jetbrains.annotations.NotNull
    com.example.feed.domain.user.domain.repository.UserJpaRepository userJpaRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.feed.domain.user.domain.User queryUserById(@org.jetbrains.annotations.Nullable
    java.util.UUID id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.feed.domain.user.domain.User queryUserByAccountId(@org.jetbrains.annotations.NotNull
    java.lang.String accountId) {
        return null;
    }
    
    public boolean existsUserByAccountId(@org.jetbrains.annotations.NotNull
    java.lang.String accountId) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.feed.domain.user.domain.User saveUser(@org.jetbrains.annotations.NotNull
    com.example.feed.domain.user.domain.User user) {
        return null;
    }
}