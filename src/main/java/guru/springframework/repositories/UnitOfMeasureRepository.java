package guru.springframework.repositories;

import guru.springframework.models.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by iballart on 23/07/18.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
