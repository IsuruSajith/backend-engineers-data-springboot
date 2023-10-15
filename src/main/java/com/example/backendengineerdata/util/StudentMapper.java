package com.example.backendengineerdata.util;

import com.example.backendengineerdata.dto.StudentDTO;
import com.example.backendengineerdata.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);
    StudentDTO entityToDto(Student entity);
    Student dtoToEntity(StudentDTO dto);

    /*@Mapping(source = "studentIndex", target = "studentIndex")
    StudentDTO entityToDto(Student student);*/

    List<StudentDTO> entityListToDtoList(List<Student> entities);
}
