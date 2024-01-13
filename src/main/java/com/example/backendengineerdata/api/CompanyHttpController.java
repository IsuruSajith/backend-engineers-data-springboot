package com.example.backendengineerdata.api;

import com.example.backendengineerdata.service.custom.CompanyService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/companies")
public class CompanyHttpController {

    private final CompanyService companyService;

    public CompanyHttpController(CompanyService companyService) {
        this.companyService = companyService;
    }
}
