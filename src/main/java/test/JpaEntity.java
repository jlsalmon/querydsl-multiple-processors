package test;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Justin Lewis Salmon
 */
@Entity
public class JpaEntity {

  @Id
  private Long id;
}
