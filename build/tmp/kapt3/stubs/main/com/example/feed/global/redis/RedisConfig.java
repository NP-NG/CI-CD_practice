package com.example.feed.global.redis;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/feed/global/redis/RedisConfig;", "", "redisProperties", "Lorg/springframework/boot/autoconfigure/data/redis/RedisProperties;", "(Lorg/springframework/boot/autoconfigure/data/redis/RedisProperties;)V", "redisConnectionFactory", "Lorg/springframework/data/redis/connection/RedisConnectionFactory;", "feed"})
@org.springframework.context.annotation.Configuration
public class RedisConfig {
    private final org.springframework.boot.autoconfigure.data.redis.RedisProperties redisProperties = null;
    
    public RedisConfig(@org.jetbrains.annotations.NotNull
    org.springframework.boot.autoconfigure.data.redis.RedisProperties redisProperties) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public org.springframework.data.redis.connection.RedisConnectionFactory redisConnectionFactory() {
        return null;
    }
}