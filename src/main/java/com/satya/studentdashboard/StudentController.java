package com.satya.studentdashboard;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository repo;

    // 🔹 Constructor Injection
    public StudentController(StudentRepository repo) {
        this.repo = repo;
    }

    // ✅ GET - Fetch all students
    @GetMapping
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    // ✅ POST - Add new student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return repo.save(student);
    }

    // ✅ PUT - Update student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student s) {
        return repo.findById(id).map(existing -> {
            existing.setName(s.getName());
            existing.setMarks(s.getMarks());
            return repo.save(existing);
        }).orElseThrow(() -> new RuntimeException("Student not found with id " + id));
    }

    // ✅ DELETE - Remove student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        repo.deleteById(id);
        return "Deleted Successfully";
    }
}