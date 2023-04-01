package com.example.feed.domain.feed.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J\u0012\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0017J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0017J\u001c\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\r\u001a\u00020\u0016H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/feed/domain/feed/presentation/FeedController;", "", "createFeedService", "Lcom/example/feed/domain/feed/service/CreateFeedService;", "queryFeedsService", "Lcom/example/feed/domain/feed/service/QueryFeedsService;", "updateFeedService", "Lcom/example/feed/domain/feed/service/UpdateFeedService;", "deleteFeedService", "Lcom/example/feed/domain/feed/service/DeleteFeedService;", "(Lcom/example/feed/domain/feed/service/CreateFeedService;Lcom/example/feed/domain/feed/service/QueryFeedsService;Lcom/example/feed/domain/feed/service/UpdateFeedService;Lcom/example/feed/domain/feed/service/DeleteFeedService;)V", "create", "", "request", "Lcom/example/feed/domain/feed/presentation/dto/request/CreateFeedRequest;", "delete", "feedId", "Ljava/util/UUID;", "get", "", "Lcom/example/feed/domain/feed/presentation/dto/response/QueryFeedsResponse;", "update", "Lcom/example/feed/domain/feed/presentation/dto/request/UpdateFeedRequest;", "feed"})
@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping(value = {"/feeds"})
public class FeedController {
    private final com.example.feed.domain.feed.service.CreateFeedService createFeedService = null;
    private final com.example.feed.domain.feed.service.QueryFeedsService queryFeedsService = null;
    private final com.example.feed.domain.feed.service.UpdateFeedService updateFeedService = null;
    private final com.example.feed.domain.feed.service.DeleteFeedService deleteFeedService = null;
    
    public FeedController(@org.jetbrains.annotations.NotNull
    com.example.feed.domain.feed.service.CreateFeedService createFeedService, @org.jetbrains.annotations.NotNull
    com.example.feed.domain.feed.service.QueryFeedsService queryFeedsService, @org.jetbrains.annotations.NotNull
    com.example.feed.domain.feed.service.UpdateFeedService updateFeedService, @org.jetbrains.annotations.NotNull
    com.example.feed.domain.feed.service.DeleteFeedService deleteFeedService) {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
    public void create(@org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    @org.springframework.web.bind.annotation.RequestBody
    com.example.feed.domain.feed.presentation.dto.request.CreateFeedRequest request) {
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping
    public java.util.List<com.example.feed.domain.feed.presentation.dto.response.QueryFeedsResponse> get() {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PutMapping(value = {"/{feed-id}"})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.NO_CONTENT)
    public void update(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(value = "feed-id")
    java.util.UUID feedId, @org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    @org.springframework.web.bind.annotation.RequestBody
    com.example.feed.domain.feed.presentation.dto.request.UpdateFeedRequest request) {
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{feed-id}"})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.NO_CONTENT)
    public void delete(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(value = "feed-id")
    java.util.UUID feedId) {
    }
}