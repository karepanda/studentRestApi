package org.application.core.studentrestapi.controller;

import org.application.core.studentrestapi.entities.Students;
import org.application.core.studentrestapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students/")
    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public Students getStudents(@PathVariable("id") int id){
        return studentRepository.findById(id).get();
    }

    @PostMapping("/students/")
    public Students createStudents(@RequestBody Students students){
        return studentRepository.save(students);
    }

    @PutMapping("/students/")
    public Students updateStudents(@RequestBody Students students){
        return studentRepository.save(students);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudents(@PathVariable("id") int id){
        studentRepository.deleteById(id);
    }
}
