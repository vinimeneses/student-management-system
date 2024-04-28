package com.javaguides.sms.service;

import com.javaguides.sms.dto.StudentDto;

import java.util.List;

public interface StudentService  {
    List<StudentDto> getAllStudents();

    void createStudent(StudentDto studentDto);
}
