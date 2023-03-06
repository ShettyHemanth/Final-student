package com.example.finalstudent.controller;

import com.example.finalstudent.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest
{

    @Test
    void getTest()
    {
        String url ="http://localhost:7000/details";

        StudentController sf=new StudentController();

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity=restTemplate.getForEntity(url,String.class,sf);

        assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);

        System.out.println(responseEntity.getBody());

    }



    @Test
    void postTest()
    {
        String url ="http://localhost:7000/users";

        StudentController sf=new StudentController();
        Student student = new Student("jj","EC");

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> responseEntity= restTemplate.postForEntity(url,student,String.class);

        assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
    }


}