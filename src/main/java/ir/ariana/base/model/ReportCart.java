package ir.ariana.base.model;

import ir.ariana.base.entity.BaseEntity;
import jakarta.persistence.JoinColumn;

public class ReportCart extends BaseEntity<Long> {
    @JoinColumn(name = "student_id")
    private Student student;
    @JoinColumn(name = "course_id")
    private Course course;
    private Double score;
}
