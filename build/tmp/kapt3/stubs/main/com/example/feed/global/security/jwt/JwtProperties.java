package com.example.feed.global.security.jwt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lcom/example/feed/global/security/jwt/JwtProperties;", "", "secret", "", "header", "prefix", "accessExp", "", "refreshExp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "getAccessExp", "()J", "getHeader", "()Ljava/lang/String;", "getPrefix", "getRefreshExp", "getSecret", "feed"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "jwt")
@org.springframework.boot.context.properties.ConstructorBinding
public final class JwtProperties {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String secret = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String header = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String prefix = null;
    private final long accessExp = 0L;
    private final long refreshExp = 0L;
    
    public JwtProperties(@org.jetbrains.annotations.NotNull
    java.lang.String secret, @org.jetbrains.annotations.NotNull
    java.lang.String header, @org.jetbrains.annotations.NotNull
    java.lang.String prefix, long accessExp, long refreshExp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSecret() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHeader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPrefix() {
        return null;
    }
    
    public final long getAccessExp() {
        return 0L;
    }
    
    public final long getRefreshExp() {
        return 0L;
    }
}