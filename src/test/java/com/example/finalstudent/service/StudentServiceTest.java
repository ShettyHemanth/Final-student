package com.example.finalstudent.service;

import com.example.finalstudent.StudentDto.StudentTo;
import com.example.finalstudent.exception.StudentNotFoundException;
import com.example.finalstudent.model.Student;
import com.example.finalstudent.repository.StudentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

class StudentServiceTest
{
    @Mock
    private StudentRepository sr;

    @InjectMocks
    private StudentService ss;


    @Test
    void createpokemonTest()
    {
        Student s=new Student("aca","cs");   //entity object


//        when(sr.save(Mockito.any(Student.class))).thenReturn(s);

/*
        StudentTo s1=new StudentTo("Hemanth","Mca");


        StudentTo result=ss.addStudents(s1);


        Assertions.assertNotEquals(result,null);

        */

        //Scenario 2 check for Exception.

        StudentTo s2=new StudentTo(null,"Cse");


        //Assertions.assertNotEquals(r2,null);

     //   Assertions.assertThrows(StudentNotFoundException.class,()->ss.addStudents(s2));

        Assertions.assertThrows(StudentNotFoundException.class,()->ss.addStudents(s2));


    }

    @Test
    void createRightTest()
    {

        Student s=new Student("hemanth","Cse");

        StudentTo st=new StudentTo("ram","ise");



        when(sr.save(Mockito.any(Student.class))).thenReturn(s);

        StudentTo result=ss.addStudents(st);

        Assertions.assertNotEquals(result,null);


    }

}