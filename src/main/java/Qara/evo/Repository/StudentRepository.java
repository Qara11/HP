package Qara.evo.Repository;

import Qara.evo.Dto.StudentDto;
import Qara.evo.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    List<Student> getByName (String name);
}
