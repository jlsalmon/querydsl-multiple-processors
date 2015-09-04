package test;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QMongoEntity is a Querydsl query type for MongoEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMongoEntity extends EntityPathBase<MongoEntity> {

    private static final long serialVersionUID = 923714171L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMongoEntity mongoEntity = new QMongoEntity("mongoEntity");

    public final StringPath id = createString("id");

    public final QJpaEntity jpaEntity;

    public QMongoEntity(String variable) {
        this(MongoEntity.class, forVariable(variable), INITS);
    }

    public QMongoEntity(Path<? extends MongoEntity> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMongoEntity(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMongoEntity(PathMetadata<?> metadata, PathInits inits) {
        this(MongoEntity.class, metadata, inits);
    }

    public QMongoEntity(Class<? extends MongoEntity> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.jpaEntity = inits.isInitialized("jpaEntity") ? new QJpaEntity(forProperty("jpaEntity")) : null;
    }

}

