package com.example.feed.domain.feed.presentation.dto.response;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.example.feed.domain.feed.presentation.dto.response.QQueryFeedsResponse is a Querydsl Projection type for QueryFeedsResponse
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QQueryFeedsResponse extends ConstructorExpression<QueryFeedsResponse> {

    private static final long serialVersionUID = -107816867L;

    public QQueryFeedsResponse(com.querydsl.core.types.Expression<java.util.UUID> feedId, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> content, com.querydsl.core.types.Expression<String> username, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdAt) {
        super(QueryFeedsResponse.class, new Class<?>[]{java.util.UUID.class, String.class, String.class, String.class, java.time.LocalDateTime.class}, feedId, title, content, username, createdAt);
    }

}

