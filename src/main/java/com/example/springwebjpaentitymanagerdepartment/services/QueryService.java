package com.example.springwebjpaentitymanagerdepartment.services;

import com.example.springwebjpaentitymanagerdepartment.detail.StudentDetail;
import com.example.springwebjpaentitymanagerdepartment.entity.StudentEntity;
import com.example.springwebjpaentitymanagerdepartment.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Service
public class QueryService implements IQueryService{

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    EntityManagerFactory emf;
    @Override
    public List<StudentDetail> JPQLQuery() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Query query = em.createQuery("Select s.rollNumber,s.name,d.departName,"
                +"s.age,s.email from StudentEntity s " +
                "inner join DepartmentEntity d on s.departmentId=d.departmentId");
        @SuppressWarnings("unchecked")
        List<StudentDetail> list = (List<StudentDetail>) query.getResultList();
        System.out.println("Student Name :");
        em.close();
        return list;
    }

    public List<StudentEntity> studentAllData(){
        return studentRepository.findAll();
    }
}
