package com.example.feed.domain.user.presentation.dto.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/example/feed/domain/user/presentation/dto/request/SignUpRequest;", "", "accountId", "", "password", "name", "birthday", "sex", "Lcom/example/feed/domain/user/domain/enums/Sex;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/feed/domain/user/domain/enums/Sex;)V", "getAccountId", "()Ljava/lang/String;", "getBirthday", "getName", "getPassword", "getSex", "()Lcom/example/feed/domain/user/domain/enums/Sex;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feed"})
public final class SignUpRequest {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String accountId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String password = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String birthday = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.feed.domain.user.domain.enums.Sex sex = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feed.domain.user.presentation.dto.request.SignUpRequest copy(@org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    java.lang.String accountId, @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    java.lang.String password, @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    java.lang.String name, @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    java.lang.String birthday, @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotNull
    com.example.feed.domain.user.domain.enums.Sex sex) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public SignUpRequest(@org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    java.lang.String accountId, @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    java.lang.String password, @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    java.lang.String name, @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    java.lang.String birthday, @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotNull
    com.example.feed.domain.user.domain.enums.Sex sex) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAccountId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBirthday() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feed.domain.user.domain.enums.Sex component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feed.domain.user.domain.enums.Sex getSex() {
        return null;
    }
}