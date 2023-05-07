package com.hupix.controller;

import com.hupix.entity.Student;
import com.hupix.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class TestController {

    private StudentService studentService;

    @Autowired
    public TestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/queryOne/{no}")
    public Student queryOne(@PathVariable("no") String no) {
        return studentService.queryByClazzNo(no);
    }

    /**
     * 查询所有学生
     * @return
     */
    @GetMapping("/queryAll")
    public List<Student> queryAll() {
        // TODO 查询所有学生
        return null;
    }
}
