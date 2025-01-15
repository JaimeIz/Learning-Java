package training.students_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import training.students_api.model.Student;
import training.students_api.repository.StudentRepository;

@Service
public class StudentService {

    private StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public Optional<Student> getById(Long id) {
        return repo.findById(id);
    }
    
    // TODO: Rethink if this method should allow the update of already existing students.
    public Student create(Student student) {
        return repo.save(student);
    }

    public Optional<Student> update(Student student) {
        Optional<Student> old_pelicula = this.getById(student.getId());

        if (old_pelicula.isEmpty()) return Optional.empty();
            
        repo.save(student);            
        return Optional.of(student);
    }

    public boolean remove(Student student) {
        Optional<Student> old_student = this.getById(student.getId());
        
        if (old_student.isEmpty()) return false;
        
        repo.delete(student);
        return true;
    }

    public Optional<Student> removeById(Long id) {
        Optional<Student> student = this.getById(id);
        
        if (student.isEmpty()) return Optional.empty();
        
        repo.delete(student.get());
        return student;
    }

    public Optional<Student> getByEmail(String email) {
        Student student = new Student();
        student.setEmail(email);

        return repo.findOne(Example.of(student));
    }

}
