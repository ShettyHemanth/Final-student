package com.example.finalstudent.StudentDto;





import com.example.finalstudent.model.Student;
import com.example.finalstudent.service.StudentService;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;



public class StudentTo
{

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    @Column(name="usn")
    private UUID usn;


    @Column(name="name")
    private String name;

    @Column(name="branch")
    private String branch;


    public StudentTo(UUID usn,String name, String branch)
    {
        this.usn =usn;
        this.name =name;
        this.branch =branch;
    }
    public StudentTo(String name,String branch)
    {
        this.name=name;
        this.branch=branch;
    }

    public UUID getUsn()
    {
        return usn;
    }



    public void setUsn(UUID usn)
    {
        this.usn = usn;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch)
    {
        this.branch = branch;
    }


}

