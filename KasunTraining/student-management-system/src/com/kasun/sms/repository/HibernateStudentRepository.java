package com.kasun.sms.repository;

import java.util.ArrayList;
import java.util.List;

import com.kasun.sms.modal.Student;

public class HibernateStudentRepository implements  StudentRepository{
	
	/* (non-Javadoc)
	 * @see com.kasun.sms.repository.StudentRepository#fetchAllStudents()
	 */
	@Override
	public List<Student> fetchAllStudents(){
		
		List<Student> students=new ArrayList<>();
		
		Student student =new Student();
		student.setId(1);
		student.setName("kasun");
		students.add(student);
		return students;
	}
}
