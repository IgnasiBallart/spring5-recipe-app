package guru.springframework.repositories;

import guru.springframework.models.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by iballart on 23/07/18.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
