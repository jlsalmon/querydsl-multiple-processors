package test;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Justin Lewis Salmon
 */
@Document
public class MongoEntity {

  @Id
  private String id;
  private JpaEntity jpaEntity;
}
