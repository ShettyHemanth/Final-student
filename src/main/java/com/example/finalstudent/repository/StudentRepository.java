package com.example.finalstudent.repository;

import com.example.finalstudent.StudentDto.StudentTo;
import com.example.finalstudent.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository
public interface StudentRepository extends JpaRepository<Student, UUID>
{



}

