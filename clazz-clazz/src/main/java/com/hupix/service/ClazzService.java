package com.hupix.service;

import com.hupix.entity.Clazz;
import com.hupix.entity.Student;
import com.hupix.feign.StudentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClazzService {

    private StudentClient studentClient;

    @Autowired
    public ClazzService(StudentClient studentClient) {
        this.studentClient = studentClient;
    }

    public List<Clazz> queryAll() {
        Clazz clazz1 = new Clazz();
        clazz1.setId(1);
        clazz1.setAddress("道荣楼");
        clazz1.setClazzNo("10");
        Clazz clazz2 = new Clazz();
        clazz2.setId(2);
        clazz2.setAddress("资讯楼");
        clazz2.setClazzNo("11");
        Clazz clazz3 = new Clazz();
        clazz3.setId(3);
        clazz3.setAddress("jack楼");
        clazz3.setClazzNo("15");
        List<Clazz> list = new ArrayList();
        list.add(clazz1);
        list.add(clazz2);
        list.add(clazz3);

        // 遍历数组查询本班学生
        list.forEach(clazz -> {
            String no = clazz.getClazzNo();
            Student student = studentClient.queryOne(no);
            clazz.setStudent(student);
        });
        return list;
    }

}
