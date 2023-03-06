package com.example.finalstudent.service;

import com.example.finalstudent.StudentDto.StudentTo;

import java.util.List;
import java.util.UUID;

public interface StudentServiceIntf
{
    List<StudentTo> getAllStudents();
    StudentTo addStudents(StudentTo w);

    void deleteStudents(StudentTo s);

    void deleteStudentsId(UUID id);





  //  void updateStudent(Integer id);

}
