package com.sampath.spring_data_jpa.service;

import com.sampath.spring_data_jpa.model.Student;
import com.sampath.spring_data_jpa.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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


    public void addorUpdate(Student student) {
        repo.save(student);
    }

    public void delete(int id)
    {
        repo.deleteById(id);
    }
    public Optional<Student> findById(int studentId)
    {
        return repo.findById(studentId);
    }
    public List<Student> findall() {
        List<Student> retrievedList = repo.findAll();
        return retrievedList;
    }

    public Student findByName(String sname)
    {
        return repo.findByName(sname);
    }

    public List<Student> findByNameAndMarks(String name, int marks)
    {
        return repo.findByNameAndMarks(name, marks);
    }

    public  List<Student> findByMarksGreaterThan(int marks)
    {
        return repo.findByMarksGreaterThan(marks);
    }
}
