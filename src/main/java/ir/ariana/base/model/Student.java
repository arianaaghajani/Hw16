package ir.ariana.base.model;

import ir.ariana.base.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "students")
public class Student extends BaseEntity<Long> {

    @NotNull(message = "name can't null")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "student_code")
    private String studentCode;

    @Column(unique = true)
    private String password;

    @Column(name = "phone_number")
    private String phoneNumber;

    public Student(Long aLong, String firstName, String lastName, String studentCode,
                   String password, String phoneNumber) {
        super(aLong);
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentCode = studentCode;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public Student(String firstName, String lastName, String studentCode,
                   String password, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentCode = studentCode;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
}
