package ea.labs.firstlab.batch;

import ea.labs.firstlab.domains.Student;
import ea.labs.firstlab.services.StudentService;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Student> {
    @Autowired
    StudentService studentService;

    @Override
    public void write(List<? extends Student> users) throws Exception {
        studentService.saveAll((List<Student>) users);
    }
}
