package com.example.feed.global.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/feed/global/entity/BaseUUIDEntity;", "", "id", "Ljava/util/UUID;", "(Ljava/util/UUID;)V", "getId", "()Ljava/util/UUID;", "feed"})
@javax.persistence.MappedSuperclass
public abstract class BaseUUIDEntity {
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(columnDefinition = "BINARY(16)", nullable = false)
    @javax.persistence.Id
    private final java.util.UUID id = null;
    
    public BaseUUIDEntity() {
        super();
    }
    
    public BaseUUIDEntity(@org.jetbrains.annotations.NotNull
    java.util.UUID id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.UUID getId() {
        return null;
    }
}