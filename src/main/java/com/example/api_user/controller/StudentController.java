package com.example.api_user.controller;

import com.example.api_user.model.Student;
import com.example.api_user.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student.getName());
    }

    @PostMapping("/{studentId}/enroll/{courseId}")
    public Student enrollStudentInCourse(@PathVariable Long studentId, @PathVariable Long courseId) {
        return studentService.enrollStudentInCourse(studentId, courseId);
    }
}
