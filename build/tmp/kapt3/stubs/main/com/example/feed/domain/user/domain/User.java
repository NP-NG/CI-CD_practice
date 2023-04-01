package com.example.feed.domain.user.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/example/feed/domain/user/domain/User;", "Lcom/example/feed/global/entity/BaseUUIDEntity;", "accountId", "", "password", "name", "birthday", "sex", "Lcom/example/feed/domain/user/domain/enums/Sex;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/feed/domain/user/domain/enums/Sex;)V", "getAccountId", "()Ljava/lang/String;", "getBirthday", "getName", "getPassword", "getSex", "()Lcom/example/feed/domain/user/domain/enums/Sex;", "feed"})
@javax.persistence.Entity
public class User extends com.example.feed.global.entity.BaseUUIDEntity {
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(columnDefinition = "VARCHAR(30)", nullable = false, unique = true)
    private final java.lang.String accountId = null;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(columnDefinition = "VARCHAR(100)", nullable = false)
    private final java.lang.String password = null;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(columnDefinition = "VARCHAR(20)", nullable = false)
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(columnDefinition = "VARCHAR(10)", nullable = false)
    private final java.lang.String birthday = null;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(columnDefinition = "VARCHAR(6)", nullable = false)
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private final com.example.feed.domain.user.domain.enums.Sex sex = null;
    
    public User(@org.jetbrains.annotations.NotNull
    java.lang.String accountId, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String birthday, @org.jetbrains.annotations.NotNull
    com.example.feed.domain.user.domain.enums.Sex sex) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getAccountId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getBirthday() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.feed.domain.user.domain.enums.Sex getSex() {
        return null;
    }
}