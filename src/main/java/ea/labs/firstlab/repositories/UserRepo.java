package ea.labs.firstlab.repositories;

import ea.labs.firstlab.domains.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
}
