package com.vcube.studentportal.service;

import java.util.List;

import com.vcube.studentportal.model.Student;

public interface StudentService {
	
	public abstract Student createStudent(Student s);
	
	List<Student> getAllStudents();
	
	Student getStudentByID(Integer sid);
	Student updateStudent(Student student, Integer id);
	void deleteStudentById(Integer id);

	Student getStudentByFname(String name);
}
