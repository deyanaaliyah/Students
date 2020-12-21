package com.example.demo.controller;

import com.example.demo.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @Autowired
    private IStudentRepository repository;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("studentsToReturn", repository.findAll());
        return "index";
    }


}
