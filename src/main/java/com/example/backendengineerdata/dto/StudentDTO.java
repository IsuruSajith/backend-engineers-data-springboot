package com.example.backendengineerdata.dto;

import com.example.backendengineerdata.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO implements Serializable {
    private String index;
    private String name;
    private String profession;
    private Gender gender;

}
