package com.example.feed.domain.feed.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/feed/domain/feed/service/QueryFeedsService;", "", "feedRepository", "Lcom/example/feed/domain/feed/domain/repository/FeedRepository;", "(Lcom/example/feed/domain/feed/domain/repository/FeedRepository;)V", "execute", "", "Lcom/example/feed/domain/feed/presentation/dto/response/QueryFeedsResponse;", "feed"})
@org.springframework.stereotype.Service
public class QueryFeedsService {
    private final com.example.feed.domain.feed.domain.repository.FeedRepository feedRepository = null;
    
    public QueryFeedsService(@org.jetbrains.annotations.NotNull
    com.example.feed.domain.feed.domain.repository.FeedRepository feedRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public java.util.List<com.example.feed.domain.feed.presentation.dto.response.QueryFeedsResponse> execute() {
        return null;
    }
}