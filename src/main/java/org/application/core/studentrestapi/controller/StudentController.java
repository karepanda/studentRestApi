package org.application.core.studentrestapi.controller;

import org.application.core.studentrestapi.entities.Student;
import org.application.core.studentrestapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/student/")
    public List<Student> getAllProducts() {
        return studentRepository.findAll();
    }

    @GetMapping("/student/{id}")
    public Student getProduct(@PathVariable("id") int id){
        return studentRepository.findById(id).get();
    }

    @PostMapping("/student/")
    public Student createProduct(@RequestBody Student product){
        return studentRepository.save(product);
    }

    @PutMapping("/student/")
    public Student updateProduct(@RequestBody Student product){
        return studentRepository.save(product);
    }

    @DeleteMapping("/student/{id}")
    public void deleteProduct(@PathVariable("id") int id){
        studentRepository.deleteById(id);
    }
}
