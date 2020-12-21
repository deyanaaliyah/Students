package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class StudentController {

    @Autowired
    private IStudentRepository repository;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("studentsToReturn", repository.findAll());
        return "index";
    }


    @GetMapping("/delete-student/{id}")
    private String deleteAlbum(@PathVariable("id") Long id){

        Optional<Student> student = repository.findById(id);

        repository.deleteById(student.get().getId());

        return "successful";
    }
}
