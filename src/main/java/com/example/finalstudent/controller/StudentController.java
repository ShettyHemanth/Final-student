

package com.example.finalstudent.controller;


import com.example.finalstudent.StudentDto.StudentTo;
import com.example.finalstudent.model.Student;
import com.example.finalstudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@RestController
public class StudentController
{
    @Autowired
    StudentService ss;



    @GetMapping("/details")
    public List<StudentTo> getAllAccounts()
    {
        return ss.getAllStudents();

    }

    @GetMapping("/details/{id}")
    public Optional<Student> getAllId(@PathVariable UUID id)
    {
        return ss.getID(id);

    }




    @RequestMapping(method = RequestMethod.POST,value = "/users")
    public void addStudents(@RequestBody StudentTo stud)
    {

        ss.addStudents(stud);
    }

    @RequestMapping(method=RequestMethod.DELETE,value ="/del" )
    public void deleteStudents(@RequestBody StudentTo stud)
    {
        ss.deleteStudents(stud);
    }


  @RequestMapping(method = RequestMethod.DELETE,value="/del/{id}")
  public void deleteStudents(@PathVariable UUID id)
  {


      ss.deleteStudentsId(id);
  }


    @RequestMapping(method = RequestMethod.PUT,value = "/up")
    public void updateStudents(@RequestBody StudentTo stud)
    {


        ss.updateStudent(stud);
    }

    @RequestMapping(method=RequestMethod.PATCH,value ="/up/{id}")

    public void updateStudentPatch(@RequestBody StudentTo s,@PathVariable String id)
    {
        ss.updateStudentPatch(s,id);
    }




}


