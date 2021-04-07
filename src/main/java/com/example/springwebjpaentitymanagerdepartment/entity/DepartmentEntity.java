package com.example.springwebjpaentitymanagerdepartment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Department",schema = "dbo")
public class DepartmentEntity {

    @Id
    @Column(name = "DepartmentId")
    private int departmentId;

    @Column(name = "DepartName")
    private String departName;

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }
}
