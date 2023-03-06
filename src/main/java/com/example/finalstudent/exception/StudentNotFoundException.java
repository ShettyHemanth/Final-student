package com.example.finalstudent.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)// 404 error
public class StudentNotFoundException extends NullPointerException
{

    public StudentNotFoundException(String message)
    {
        super(message);
    }

}
