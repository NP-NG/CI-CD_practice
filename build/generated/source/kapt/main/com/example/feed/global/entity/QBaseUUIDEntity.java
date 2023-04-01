package com.example.feed.global.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseUUIDEntity is a Querydsl query type for BaseUUIDEntity
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QBaseUUIDEntity extends EntityPathBase<BaseUUIDEntity> {

    private static final long serialVersionUID = -1935819474L;

    public static final QBaseUUIDEntity baseUUIDEntity = new QBaseUUIDEntity("baseUUIDEntity");

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public QBaseUUIDEntity(String variable) {
        super(BaseUUIDEntity.class, forVariable(variable));
    }

    public QBaseUUIDEntity(Path<? extends BaseUUIDEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBaseUUIDEntity(PathMetadata metadata) {
        super(BaseUUIDEntity.class, metadata);
    }

}

