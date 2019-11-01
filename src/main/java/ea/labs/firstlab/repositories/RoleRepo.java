package ea.labs.firstlab.repositories;

import ea.labs.firstlab.domains.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepo extends CrudRepository<Role, Integer> {
    List<Role> findAll();
}
