package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.IStudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
