package com.example.backendengineerdata.api;

import com.example.backendengineerdata.dto.StudentDTO;
import com.example.backendengineerdata.service.custom.StudentService;
import com.example.backendengineerdata.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@CrossOrigin
public class StudentHttpController {

   private final StudentService studentService;

    public StudentHttpController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<StandardResponse> saveStudent(@RequestBody StudentDTO studentDTO) throws Exception {
        String message = (String) studentService.save(studentDTO);

        return new ResponseEntity<StandardResponse>(
                new StandardResponse(201,"saved successful",message), HttpStatus.CREATED
        );
    }

    @GetMapping
    public List<StudentDTO> getAll() throws Exception {
        List<StudentDTO> all = studentService.findAll();
        return all;
    }
}
