package ir.ariana.base.model;

import ir.ariana.base.entity.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "teachers")
public class Teacher extends BaseEntity<Long> {

    @Size(max = 20, min = 3, message = "Invalid name. Size should between 3 to 20.")
    @Column(name = "first_name",nullable = false)
    private String firstname;

    @Size(max = 20, min = 3, message = "Invalid name. Size should be between 3 to 20.")
    @Column(name = "last_name",nullable = false)
    private String lastname;

    @Column(name = "phone_number",nullable = false)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MasterDegree masterDegree;

    @OneToMany
    private List<Course> courseList=new ArrayList<>();

    @Size(max = 20, min = 8, message = "Invalid username. Size should be between 8 to 20.")
    @Column(unique = true,nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    public Teacher(Long aLong, String firstname, String lastname, String phoneNumber, MasterDegree masterDegree,
                   String username, String password) {
        super(aLong);
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.masterDegree = masterDegree;
        this.username = username;
        this.password = password;
    }
}
