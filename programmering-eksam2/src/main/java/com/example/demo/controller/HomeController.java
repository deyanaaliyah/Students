package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.IStudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HomeController {

    IStudentRepository iStudentRepository;

    public HomeController(IStudentRepository iStudentRepository) {
        this.iStudentRepository = iStudentRepository;
    }

    //Create student
    @PostMapping("/students")
    public  ResponseEntity<String> create(@ModelAttribute Student studentToCreate){
        Student student = iStudentRepository.save(studentToCreate);
        return  ResponseEntity.status(201).header("Location","/students/" + student.getId()).body("{'Msg': 'student created'}");
    }

    //Read all students
    @GetMapping("/students")
    public Iterable<Student> index(){
        return iStudentRepository.findAll();
    }

    //Read student by id
    @GetMapping("/students/{id}")
    public ResponseEntity<Optional<Student>> findById(@PathVariable Long id){
        Optional<Student> response = iStudentRepository.findById(id);
        if(response.isPresent()){
            return ResponseEntity.status(200).body(response);
        }else{
            return ResponseEntity.status(404).body(response);
        }
    }

    //delete by id
    @DeleteMapping("/students/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        iStudentRepository.deleteById(id);
        return ResponseEntity.status(200).body("{'msg' : 'deleted'}");
    }

    //Update students
    @PutMapping("/students")
    public ResponseEntity<String> update(@ModelAttribute Student studentToUpdate){
        iStudentRepository.save(studentToUpdate);
        return ResponseEntity.status(204).body("{'msg':'Hello'}");
    }
}
