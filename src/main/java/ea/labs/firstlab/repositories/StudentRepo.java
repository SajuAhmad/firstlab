package ea.labs.firstlab.repositories;

import ea.labs.firstlab.domains.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {
}
