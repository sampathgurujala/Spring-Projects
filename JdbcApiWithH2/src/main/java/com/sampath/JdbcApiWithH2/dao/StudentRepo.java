package com.sampath.JdbcApiWithH2.dao;


import com.sampath.JdbcApiWithH2.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentRepo {

    @Autowired
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student) {
        String sql = "insert into student values (?,?,?)";
        int rows = jdbc.update(sql,student.getRollNo(),student.getName(),student.getMarks());
        System.out.println("rows affected: "+rows);
    }


    public List<Student> findAll() {

        String sql = "select * from student";
        List<Student> retrievedList = jdbc.query(sql, (rs, rowNum) -> {
            Student st = new Student();
            st.setRollNo(rs.getInt(1));
            st.setName(rs.getString(2));
            st.setMarks(rs.getInt(3));
            return st;
        });
        return retrievedList;
    }
}
