package com.kasun.sms.repository;

import java.util.List;

import com.kasun.sms.modal.Student;

public interface StudentRepository {

	List<Student> fetchAllStudents();

}