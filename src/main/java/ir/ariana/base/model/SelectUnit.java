package ir.ariana.base.model;

import ir.ariana.base.entity.BaseEntity;
import jakarta.persistence.*;

@Entity
public class SelectUnit extends BaseEntity<Long> {
    @OneToOne
    private Student student;
    @ManyToOne
    private Course course;

}
