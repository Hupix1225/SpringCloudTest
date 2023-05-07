package com.hupix.service;

import com.hupix.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public Student queryByClazzNo(String clazzNo) {
        Student s1 = new Student();
        s1.setClazzNo("10");
        s1.setId(1);
        s1.setName("tom");

        if (clazzNo.equals(s1.getClazzNo())) {
            return s1;
        }
        return null;

    }
}
