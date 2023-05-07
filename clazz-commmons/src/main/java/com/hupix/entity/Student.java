package com.hupix.entity;

public class Student {

    private Integer id;
    private String name;
    private String clazzNo;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clazzNo='" + clazzNo + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazzNo() {
        return clazzNo;
    }

    public void setClazzNo(String clazzNo) {
        this.clazzNo = clazzNo;
    }

    public Student() {
    }

    public Student(Integer id, String name, String clazzNo) {
        this.id = id;
        this.name = name;
        this.clazzNo = clazzNo;
    }
}
