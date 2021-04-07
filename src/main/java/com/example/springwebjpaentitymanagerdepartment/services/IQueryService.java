package com.example.springwebjpaentitymanagerdepartment.services;

import com.example.springwebjpaentitymanagerdepartment.detail.StudentDetail;

import java.util.List;

public interface IQueryService {

    List<StudentDetail> JPQLQuery();
}
