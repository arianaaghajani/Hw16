package ir.ariana.base.model;

import ir.ariana.base.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Course extends BaseEntity<Long> {
    @Column(name = "name",nullable = false)
    private String name;
    private String startTime;
    private String finishTime;

    @Column(nullable = false)
    private Integer Unit;

    private Long price;

//    @ManyToOne
//    private Student student;
//
//    @ManyToOne
//    private Teacher teacher;
}
