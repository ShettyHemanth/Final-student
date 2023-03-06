package com.example.finalstudent.repository;

import com.example.finalstudent.model.Student;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
class StudentRepositoryTest
{

    @Autowired
    StudentRepository sr;

    @Test
    void repositoryTest()
    {
        //arrange
        Student snew=new Student("Rahul","Civil");

        //act

        Student savedStudent=sr.save(snew);  //entering the data into db

         List<Student> result=sr.findAll();  //testing findall



        //assert

       Assertions.assertEquals(result.size(),1 );


        Assertions.assertEquals(savedStudent,null);

       // System.out.println(savedStudent);


    }

    @Test
    void testDelete()
    {
        Student s1=new Student("Rahul","Cse");
        Student s2=new Student("Samran","Ise");



        sr.save(s1);
        sr.save(s2);

        sr.deleteAll();



        List<Student> result=sr.findAll();

        Assertions.assertEquals(result.size(),0);


    }

    @Test
    void demo()
    {
        //

         Student s=new Student("Hemanth","Cse");

       sr.save(s);

        Optional<Student> Stud=sr.findById(s.getUsn());




        Assertions.assertNotEquals(Stud,null);

    }

    @Test
    void deleteIdTest()
    {
        Student snew=new Student("Hemanth","Cse");

        sr.save(snew);

      //  List<Student> r=sr.findAll();

      //  Assertions.assertEquals(r.size(),1);

        sr.deleteById(snew.getUsn());

        List<Student> rs=sr.findAll();

        Assertions.assertEquals(rs.size(),0);

    }

    @Test
    void testUpdate()
    {
        Student s=new Student("Jayanti","Mtech");

        Student stud=sr.save(s);

        stud.setBranch("Cse");
        stud.setName("Ram");

        Student newstud=sr.save(stud);

       // Assertions.assertNotEquals(newstud,null);
        System.out.println(newstud.getName());


    }

}