package guru.springframework.repositories;

import guru.springframework.models.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by iballart on 23/07/18.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {


}
