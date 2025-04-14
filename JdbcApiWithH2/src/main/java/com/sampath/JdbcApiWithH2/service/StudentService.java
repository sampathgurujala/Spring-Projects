package com.sampath.JdbcApiWithH2.service;

import com.sampath.JdbcApiWithH2.dao.StudentRepo;
import com.sampath.JdbcApiWithH2.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }


    public void add(Student student) {
        repo.save(student);
    }

    public List<Student> findall() {
        List<Student> retrievedList = repo.findAll();
        return retrievedList;
    }
}
