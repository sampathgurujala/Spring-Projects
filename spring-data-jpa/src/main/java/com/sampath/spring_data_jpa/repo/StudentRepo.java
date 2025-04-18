package com.sampath.spring_data_jpa.repo;

import com.sampath.spring_data_jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {


     Student findByName(String sname);

     List<Student> findByMarksGreaterThan(int marks);

     @Query("select s from Student s where s.name=?1 and s.marks=?2")
     List<Student> findByNameAndMarks(String name, int marks);
}
