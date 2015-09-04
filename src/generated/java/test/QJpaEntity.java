package test;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QJpaEntity is a Querydsl query type for JpaEntity
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QJpaEntity extends BeanPath<JpaEntity> {

    private static final long serialVersionUID = 425493794L;

    public static final QJpaEntity jpaEntity = new QJpaEntity("jpaEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QJpaEntity(String variable) {
        super(JpaEntity.class, forVariable(variable));
    }

    public QJpaEntity(Path<? extends JpaEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QJpaEntity(PathMetadata<?> metadata) {
        super(JpaEntity.class, metadata);
    }

}

