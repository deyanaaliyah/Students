package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.IStudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HomeController {

    IStudentRepository iStudentRepository;

    public HomeController(IStudentRepository iStudentRepository) {
        this.iStudentRepository = iStudentRepository;
    }

    @GetMapping("/students")
    public Iterable<Student> index(){
        return iStudentRepository.findAll();
    }

    //Read by id
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

    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        iStudentRepository.deleteById(id);
        return ResponseEntity.status(200).body("{'msg' : 'deleted'}");
    }
}
