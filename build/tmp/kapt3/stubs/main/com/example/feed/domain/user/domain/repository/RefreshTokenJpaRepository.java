package com.example.feed.domain.user.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/feed/domain/user/domain/repository/RefreshTokenJpaRepository;", "Lorg/springframework/data/repository/CrudRepository;", "Lcom/example/feed/domain/user/domain/RefreshToken;", "", "queryByToken", "token", "feed"})
public abstract interface RefreshTokenJpaRepository extends org.springframework.data.repository.CrudRepository<com.example.feed.domain.user.domain.RefreshToken, java.lang.String> {
    
    @org.jetbrains.annotations.Nullable
    public abstract com.example.feed.domain.user.domain.RefreshToken queryByToken(@org.jetbrains.annotations.NotNull
    java.lang.String token);
}