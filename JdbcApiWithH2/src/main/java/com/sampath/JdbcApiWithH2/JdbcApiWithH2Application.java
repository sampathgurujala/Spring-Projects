package com.sampath.JdbcApiWithH2;

import com.sampath.JdbcApiWithH2.model.Student;
import com.sampath.JdbcApiWithH2.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class JdbcApiWithH2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(JdbcApiWithH2Application.class, args);

		StudentService service = ctx.getBean(StudentService.class);

		//Create
		Student obj1 = ctx.getBean(Student.class);
		obj1.setRollNo(104);
		obj1.setName("Sampath");
		obj1.setMarks(98);


		service.add(obj1);

		//Read ALL

		List<Student> totalStudents = service.findall();
		System.out.println(totalStudents);


	}

}
