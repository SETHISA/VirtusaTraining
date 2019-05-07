package com.kasun.sms;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kasun.sms.modal.Student;
import com.kasun.sms.service.StudentService;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService service =context.getBean("studentService",StudentService.class);
		
		List<Student> students =service.fetchAllStudents();
		
		for (Student student : students) {
			System.out.println(student.getName());
		}
	}

}
