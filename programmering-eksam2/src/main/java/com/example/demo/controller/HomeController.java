package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.IStudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    IStudentRepository iStudentRepository;

    public HomeController(IStudentRepository iStudentRepository) {
        this.iStudentRepository = iStudentRepository;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    //Create student
    @GetMapping("/student")
    public String getCreateHtml(Model model){
        Student student = new Student();
        model.addAttribute("newStudent", student);
        return "createStudent";
    }

    //Save the created student
    @PostMapping("/student")
    public String created(@ModelAttribute Student newStudent){
        iStudentRepository.save(newStudent);
        return "index";
    }
}
