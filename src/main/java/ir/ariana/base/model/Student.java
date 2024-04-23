package ir.ariana.base.model;

import ir.ariana.base.entity.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
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

    @Column(unique = true)
    @OneToMany
    private List<Course> courses=new ArrayList<>();

    public Student(Long aLong, String firstName, String lastName, String studentCode,
                   String password, String phoneNumber) {
        super(aLong);
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentCode = studentCode;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
}
