package com.example.feed.domain.user.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -585897187L;

    public static final QUser user = new QUser("user");

    public final com.example.feed.global.entity.QBaseUUIDEntity _super = new com.example.feed.global.entity.QBaseUUIDEntity(this);

    public final StringPath accountId = createString("accountId");

    public final StringPath birthday = createString("birthday");

    //inherited
    public final ComparablePath<java.util.UUID> id = _super.id;

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final EnumPath<com.example.feed.domain.user.domain.enums.Sex> sex = createEnum("sex", com.example.feed.domain.user.domain.enums.Sex.class);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

