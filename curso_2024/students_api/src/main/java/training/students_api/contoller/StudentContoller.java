package training.students_api.contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import training.students_api.model.Student;
import training.students_api.service.StudentService;

@RestController
@RequestMapping(value = "/students")
public class StudentContoller {
    // TODO: Refine all reponses with proper error messages.
    // TODO: Extract all logic related to the repository to a service.
    // TODO: Add a verification before updating or creating students to not make java panic with a duped email due to the UNIQUE constraint in the database  
    
    @Autowired
    StudentService service;

    @GetMapping
    public ResponseEntity<List<Student>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Student>> getOne(@PathVariable("id") Long id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    // TODO: Replace return error with something else
    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Student student) {
        if (service.getByEmail(student.getEmail()).isPresent()) {
            return new ResponseEntity<>("[ERROR] An student whit the same email already exists in the database", HttpStatus.BAD_REQUEST);
        }

        service.create(student);
        return new ResponseEntity<>("Student was created successfully", HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable("id") Long id, @RequestBody Student student) {
        student.setId(id);

        service.update(student);

        return new ResponseEntity<>("Student was updated successsfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id) {
        
        service.removeById(id);

        return new ResponseEntity<>("Student was deleted successsfully", HttpStatus.OK);
    }

}
