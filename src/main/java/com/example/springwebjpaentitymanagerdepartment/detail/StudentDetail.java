package com.example.springwebjpaentitymanagerdepartment.detail;

public class StudentDetail {

    private int rollNumber;
    private String name;
    private Integer departName;
    private Integer age;
    private String email;

    public StudentDetail() {

    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDepartName() {
        return departName;
    }

    public void setDepartName(Integer departName) {
        this.departName = departName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
