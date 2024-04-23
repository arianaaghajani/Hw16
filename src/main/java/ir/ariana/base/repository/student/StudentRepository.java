package ir.ariana.base.repository.student;


import ir.ariana.base.model.Student;
import ir.ariana.base.repository.base.BaseRepository;

public interface StudentRepository extends BaseRepository<Student,Long> {
    boolean isExistsByUsername(String username);

}
