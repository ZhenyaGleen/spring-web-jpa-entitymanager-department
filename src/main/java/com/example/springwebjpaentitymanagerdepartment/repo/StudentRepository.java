package com.example.springwebjpaentitymanagerdepartment.repo;

import com.example.springwebjpaentitymanagerdepartment.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {

    @Override
    public List<StudentEntity> findAll();
}
