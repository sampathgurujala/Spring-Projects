package com.sampath.spring_data_jpa;

import com.sampath.spring_data_jpa.model.Student;
import com.sampath.spring_data_jpa.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		Student obj1 = context.getBean(Student.class);
		obj1.setRollNo(1);
		obj1.setName("Sai Sampath");
		obj1.setMarks(98);

		Student obj2 = context.getBean(Student.class);
		obj2.setRollNo(2);
		obj2.setName("Rahu");
		obj2.setMarks(98);

		Student obj3 = context.getBean(Student.class);
		obj3.setRollNo(3);
		obj3.setName("Saketh");
		obj3.setMarks(88);

		StudentService service = context.getBean(StudentService.class);
		service.addorUpdate(obj1);
		service.addorUpdate(obj2);
		service.addorUpdate(obj3);


		Optional<Student> obj4= service.findById(104);
		System.out.println(obj4.orElse(new Student()));


		System.out.println(service.findByNameAndMarks("Sampath", 98));

		System.out.println(service.findByName("Sampath"));

		System.out.println(service.findByMarksGreaterThan( 70));

		service.delete(2);

	}


}
