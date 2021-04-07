package com.example.springwebjpaentitymanagerdepartment.controller;

import com.example.springwebjpaentitymanagerdepartment.detail.StudentDetail;
import com.example.springwebjpaentitymanagerdepartment.entity.DepartmentEntity;
import com.example.springwebjpaentitymanagerdepartment.entity.StudentEntity;
import com.example.springwebjpaentitymanagerdepartment.repo.DepartmentRepository;
import com.example.springwebjpaentitymanagerdepartment.services.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QueryController {

    final
    QueryService queryService;

    public QueryController(QueryService queryService) {
        this.queryService = queryService;
    }

    @Autowired
    DepartmentRepository departmentRepo;

    @GetMapping("/dep")
    public List<DepartmentEntity> findAllDep(){
        return (List<DepartmentEntity>) departmentRepo.findAll();
    }


    @GetMapping("/studentData")
    public List<StudentEntity> getStudentsData(){
        return queryService.studentAllData();
    }

    @GetMapping("/joinQuery")
    public List<StudentDetail> findAllData(){
        return queryService.JPQLQuery();
    }
}
