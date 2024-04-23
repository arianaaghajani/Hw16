package ir.ariana.base.model;

import ir.ariana.base.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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

    @Size(max = 20, min = 3, message = "Invalid name. Size should between 3 to 20.")
    @Column(name = "first_name",nullable = false)
    private String firstname;

    @Size(max = 30, min = 3, message = "Invalid last name. Size should between 3 to 30.")
    @Column(name = "last_name")
    private String lastname;

    @Size(max = 11, message = "invalid phone number. size should 11")
    @Column(name = "phone_number",nullable = false)
    private String phoneNumber;

    @Column(unique = true,nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;

}
