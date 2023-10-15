package com.example.backendengineerdata.api;

import com.example.backendengineerdata.dto.StudentDTO;
import com.example.backendengineerdata.service.custom.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/students")
@CrossOrigin
public class StudentHttpController {

   private final StudentService studentService;

    public StudentHttpController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(consumes = "application/json")
    public String saveStudent(@RequestBody StudentDTO studentDTO) throws Exception {
        studentService.save(studentDTO);

        return null;

    }
}
