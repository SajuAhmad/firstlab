package ea.labs.firstlab.domains;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String first;

    private String last;

    private Double gpa;

    @Transient
    private Integer age;

    private LocalDate dob;
}
