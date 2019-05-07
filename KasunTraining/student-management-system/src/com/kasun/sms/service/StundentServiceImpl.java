package com.kasun.sms.service;

import java.util.List;

import com.kasun.sms.modal.Student;

import com.kasun.sms.repository.StudentRepository;

public class StundentServiceImpl implements StudentService {

	
	StudentRepository repository;
	
	
	
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
