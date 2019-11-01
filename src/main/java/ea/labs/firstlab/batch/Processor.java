package ea.labs.firstlab.batch;

import ea.labs.firstlab.domains.Student;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Processor implements ItemProcessor<Student, Student> {
    @Override
    public Student process(Student student) throws Exception {
        Integer day = 1;
        Integer month = 1;
        LocalDate currentDate = LocalDate.now();
        Integer year = currentDate.getYear() - student.getAge();
        student.setDob(LocalDate.of(year, month, day));

        return student;
    }
}
