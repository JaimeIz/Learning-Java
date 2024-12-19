package training.students_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import training.students_api.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {}
