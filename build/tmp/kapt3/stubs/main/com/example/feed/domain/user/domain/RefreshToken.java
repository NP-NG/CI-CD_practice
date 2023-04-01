package com.example.feed.domain.user.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00038\u0006@BX\u0087\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR \u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0006@BX\u0087\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/example/feed/domain/user/domain/RefreshToken;", "", "accountId", "", "token", "ttl", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getAccountId", "()Ljava/lang/String;", "<set-?>", "getToken", "getTtl", "()J", "update", "", "feed"})
@org.springframework.data.redis.core.RedisHash
public final class RefreshToken {
    @org.jetbrains.annotations.NotNull
    @org.springframework.data.annotation.Id
    private final java.lang.String accountId = null;
    @org.jetbrains.annotations.NotNull
    @org.springframework.data.redis.core.index.Indexed
    private java.lang.String token;
    @org.springframework.data.redis.core.TimeToLive
    private long ttl;
    
    public RefreshToken(@org.jetbrains.annotations.NotNull
    java.lang.String accountId, @org.jetbrains.annotations.NotNull
    java.lang.String token, long ttl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAccountId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToken() {
        return null;
    }
    
    public final long getTtl() {
        return 0L;
    }
    
    public final void update(@org.jetbrains.annotations.NotNull
    java.lang.String token, long ttl) {
    }
}