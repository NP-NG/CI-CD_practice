package com.example.feed.domain.feed.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/feed/domain/feed/service/UpdateFeedService;", "", "feedRepository", "Lcom/example/feed/domain/feed/domain/repository/FeedRepository;", "userFacade", "Lcom/example/feed/domain/user/facade/UserFacade;", "(Lcom/example/feed/domain/feed/domain/repository/FeedRepository;Lcom/example/feed/domain/user/facade/UserFacade;)V", "execute", "", "id", "Ljava/util/UUID;", "request", "Lcom/example/feed/domain/feed/presentation/dto/request/UpdateFeedRequest;", "feed"})
@org.springframework.stereotype.Service
public class UpdateFeedService {
    private final com.example.feed.domain.feed.domain.repository.FeedRepository feedRepository = null;
    private final com.example.feed.domain.user.facade.UserFacade userFacade = null;
    
    public UpdateFeedService(@org.jetbrains.annotations.NotNull
    com.example.feed.domain.feed.domain.repository.FeedRepository feedRepository, @org.jetbrains.annotations.NotNull
    com.example.feed.domain.user.facade.UserFacade userFacade) {
        super();
    }
    
    @org.springframework.transaction.annotation.Transactional
    public void execute(@org.jetbrains.annotations.NotNull
    java.util.UUID id, @org.jetbrains.annotations.NotNull
    com.example.feed.domain.feed.presentation.dto.request.UpdateFeedRequest request) {
    }
}