package com.hupix.entity;

public class Clazz {

    private Integer id;
    private String address;
    private String ClazzNo;
    private Student student;

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", ClazzNo='" + ClazzNo + '\'' +
                ", student=" + student +
                '}';
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Clazz(Integer id, String address, String clazzNo, Student student) {
        this.id = id;
        this.address = address;
        ClazzNo = clazzNo;
        this.student = student;
    }

    public Clazz() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClazzNo() {
        return ClazzNo;
    }

    public void setClazzNo(String clazzNo) {
        ClazzNo = clazzNo;
    }
}
