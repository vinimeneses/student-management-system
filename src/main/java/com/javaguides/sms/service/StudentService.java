package com.javaguides.sms.service;

import com.javaguides.sms.dto.StudentDto;

import java.util.List;

public interface StudentService  {
    List<StudentDto> getAllStudents();

    void createStudent(StudentDto studentDto);

    StudentDto getStudentById(Long studentId);

    void updateStudent(Long studentId, StudentDto student);

    void deleteStudent(Long studentId);
}
