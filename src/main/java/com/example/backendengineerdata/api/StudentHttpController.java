package com.example.backendengineerdata.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/students")
@CrossOrigin
public class StudentHttpController {

    @PostMapping(consumes = "application/json")
    public String saveStudent(@RequestBody ) {

    }
}
