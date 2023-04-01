package com.example.feed.domain.feed.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/feed/domain/feed/domain/repository/FeedRepository;", "", "feedJpaRepository", "Lcom/example/feed/domain/feed/domain/repository/FeedJpaRepository;", "jpaQueryFactory", "Lcom/querydsl/jpa/impl/JPAQueryFactory;", "(Lcom/example/feed/domain/feed/domain/repository/FeedJpaRepository;Lcom/querydsl/jpa/impl/JPAQueryFactory;)V", "deleteFeed", "", "feed", "Lcom/example/feed/domain/feed/domain/Feed;", "queryFeedById", "id", "Ljava/util/UUID;", "queryFeeds", "", "Lcom/example/feed/domain/feed/presentation/dto/response/QueryFeedsResponse;", "saveFeed"})
@org.springframework.stereotype.Repository
public class FeedRepository {
    private final com.example.feed.domain.feed.domain.repository.FeedJpaRepository feedJpaRepository = null;
    private final com.querydsl.jpa.impl.JPAQueryFactory jpaQueryFactory = null;
    
    public FeedRepository(@org.jetbrains.annotations.NotNull
    com.example.feed.domain.feed.domain.repository.FeedJpaRepository feedJpaRepository, @org.jetbrains.annotations.NotNull
    com.querydsl.jpa.impl.JPAQueryFactory jpaQueryFactory) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.feed.domain.feed.domain.Feed saveFeed(@org.jetbrains.annotations.NotNull
    com.example.feed.domain.feed.domain.Feed feed) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.example.feed.domain.feed.presentation.dto.response.QueryFeedsResponse> queryFeeds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public com.example.feed.domain.feed.domain.Feed queryFeedById(@org.jetbrains.annotations.NotNull
    java.util.UUID id) {
        return null;
    }
    
    public void deleteFeed(@org.jetbrains.annotations.NotNull
    com.example.feed.domain.feed.domain.Feed feed) {
    }
}