package com.example.finalstudent.service;

import com.example.finalstudent.StudentDto.StudentTo;
import com.example.finalstudent.exception.StudentNotFoundException;
import com.example.finalstudent.model.Student;
import com.example.finalstudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentService implements StudentServiceIntf
{

  @Autowired
    StudentRepository sr;

    public List<StudentTo> getAllStudents()
    {

       List<Student> snew=sr.findAll();

       List<StudentTo> sto=new ArrayList<>();

        for (Student studdemo : snew)
        {
            StudentTo newstudent = new StudentTo(studdemo.getUsn(), studdemo.getName(), studdemo.getBranch());

            sto.add(newstudent);
        }

       return sto;
    }




    public StudentTo addStudents(StudentTo s1) throws StudentNotFoundException
    {
       if(s1.getName()==null)
        {
            throw new StudentNotFoundException("Name cannot be null");
        }
        Student sdata=new Student(s1.getUsn(),s1.getName(),s1.getBranch());

        sr.save(sdata);

        return s1;
    }

    public void deleteStudents(StudentTo stud)
    {

       sr.deleteAll();
    }


    public void deleteStudentsId(UUID id)
    {
         if(id==null)
         {
             throw new StudentNotFoundException("Id cannot be null");
         }

         sr.deleteById(id);

    }




    public void updateStudent(StudentTo st)
    {
        if(st.getUsn()==null)
        {
            throw new StudentNotFoundException("Id cannot be null");
        }
        Student sdata=new Student(st.getUsn(),st.getName(),st.getBranch());
        sr.save(sdata);

    }

    public void updateStudentPatch(StudentTo s,String snew)
    {
        Student sdata=new Student(s.getUsn(),s.getName(),s.getBranch());
       sr.save(sdata);


    }


    public Optional<Student> getID(UUID id)
    {

       return sr.findById(id);

    }
}
