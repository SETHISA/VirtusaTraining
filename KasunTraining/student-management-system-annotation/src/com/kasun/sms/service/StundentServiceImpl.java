package com.kasun.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kasun.sms.modal.Student;

import com.kasun.sms.repository.StudentRepository;

@Service("studentService")

public class StundentServiceImpl implements StudentService {

	
	@Autowired
	StudentRepository repository;
	
	public StundentServiceImpl() {
		
		System.out.println("Default constructor fired");
	}
	
	
	public StundentServiceImpl(StudentRepository repository) {
		
		this.repository = repository;
	}
	
		public StudentRepository getRepository() {
		return repository;
	}



	public void setRepository(StudentRepository repository) {
		this.repository = repository;
	}



		/* (non-Javadoc)
		 * @see com.kasun.sms.service.StudentService#fetchAllStudents()
		 */
		@Override
		public List<Student> fetchAllStudents(){
			
			return repository.fetchAllStudents();
		}
}
