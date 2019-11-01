package ea.labs.firstlab.services.impl;

import ea.labs.firstlab.domains.Student;
import ea.labs.firstlab.repositories.StudentRepo;
import ea.labs.firstlab.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepo userRepo;

    @Override
    public void saveAll(List<Student> students) {
        userRepo.saveAll(students);
    }
}
