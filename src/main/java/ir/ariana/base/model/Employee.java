package ir.ariana.base.model;

import ir.ariana.base.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Employee extends BaseEntity<Long> {

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "national_id")
    private String nationalId;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(unique = true)
    private String username;
    private String password;

}
