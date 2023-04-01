package com.example.feed.domain.feed.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038\u0016@TX\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038\u0016@TX\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/example/feed/domain/feed/domain/Feed;", "Lcom/example/feed/global/entity/BaseEntity;", "title", "", "content", "user", "Lcom/example/feed/domain/user/domain/User;", "(Ljava/lang/String;Ljava/lang/String;Lcom/example/feed/domain/user/domain/User;)V", "<set-?>", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getUser", "()Lcom/example/feed/domain/user/domain/User;", "update", "", "feed"})
@javax.persistence.Entity
public class Feed extends com.example.feed.global.entity.BaseEntity {
    @org.jetbrains.annotations.NotNull
    @javax.persistence.JoinColumn(name = "user_id", nullable = false)
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    private final com.example.feed.domain.user.domain.User user = null;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(columnDefinition = "VARCHAR(30)", nullable = false)
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(columnDefinition = "VARCHAR(1000)", nullable = false)
    private java.lang.String content;
    
    public Feed(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String content, @org.jetbrains.annotations.NotNull
    com.example.feed.domain.user.domain.User user) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.feed.domain.user.domain.User getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getTitle() {
        return null;
    }
    
    protected void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getContent() {
        return null;
    }
    
    protected void setContent(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public void update(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String content) {
    }
}