package com.vcube.studentportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.studentportal.model.Student;
import com.vcube.studentportal.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepo studentRepo;

	@Override
	public Student createStudent(Student s) {
		return studentRepo.save(s);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll() ;
	}

	@Override
	public Student getStudentByID(Integer sid) {
		return studentRepo.findById(sid).get();
	}

	@Override
	public Student updateStudent(Student s, Integer id) {
		Student studentInfoFromDB= getStudentByID(id);
		
		studentInfoFromDB.setAge(s.getAge());
		studentInfoFromDB.setFname(s.getFname());
		studentInfoFromDB.setLname(s.getLname());
		studentInfoFromDB.setTotal_marks(s.getTotal_marks());
		
		return studentRepo.save(studentInfoFromDB);
	}

	@Override
	public void deleteStudentById(Integer id) {
		
		 studentRepo.deleteById(id);
	}

	@Override
	public Student getStudentByFname(String name) {
		return studentRepo.findByFname(name);
	}

}
