package ir.ariana.base.model;

import ir.ariana.base.entity.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import java.math.BigDecimal;

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
    private MasterDegree masterDegree;

    @ManyToOne
    private Course course;

    @Column(unique = true,nullable = false)
    private String username;
    private String password;
}
