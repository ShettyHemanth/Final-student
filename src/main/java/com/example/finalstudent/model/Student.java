package com.example.finalstudent.model;


import jakarta.persistence.*;


import java.util.UUID;

@Entity
@Table(name="student")
public class Student
{

    @Id
  @GeneratedValue(strategy=GenerationType.UUID)

    @Column(name="usn")
   private UUID usn;


    @Column(name="name")
    private String name;

    @Column(name="branch")
    private String branch;

    public Student()
    {

    }
    public Student( UUID usn,String name, String branch)
    {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
    }
    public Student(String x,String y)
    {
        this.name=x;
        this.branch=y;
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

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
