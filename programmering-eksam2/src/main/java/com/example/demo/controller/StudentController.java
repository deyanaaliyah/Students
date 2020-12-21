package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class StudentController {

    @Autowired
    private IStudentRepository iStudentRepository;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("studentsToReturn", iStudentRepository.findAll());
        return "index";
    }

    //Create student
    @GetMapping("/create-student")
    public String createStudent(Model model){
        Student student = new Student();
        model.addAttribute("newStudent", student);
        return "create-student";
    }

    //Saves the created student
    @PostMapping("/create-student")
    public String createdStudent(@ModelAttribute Student newStudent){
        iStudentRepository.save(newStudent);
        return "successful";
    }

    //Deletes student by id
    @GetMapping("/delete-student/{id}")
    private String deleteStudent(@PathVariable("id") Long id){

        Optional<Student> student = iStudentRepository.findById(id);

        iStudentRepository.deleteById(student.get().getId());

        return "successful";
    }
}