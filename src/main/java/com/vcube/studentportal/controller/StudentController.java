package com.vcube.studentportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.studentportal.model.Student;
import com.vcube.studentportal.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/welcome")
	String welcome() {
		return "Welcome to most easy concept of spring boot";
	}
	
	@DeleteMapping("/delete/{sid}")
	String deleteStudent(@PathVariable Integer sid) {
		studentService.deleteStudentById(sid);
		return " Deleted Student " + sid + " Successfully. ";
	}
	
	//http://localhost:8899/student/update/1
	@PutMapping("update/{sid}")
	Student updateStudent(@RequestBody Student s, @PathVariable Integer sid){
	
		return studentService.updateStudent(s, sid);
		
	}

	
	@GetMapping("/getAllStudents")
	List<Student> getAllStudents(){
		return studentService.getAllStudents();//findAll()
	}
	
	@GetMapping("/getStudent/{sid}")
	Student getStudent(@PathVariable Integer sid){
		return studentService.getStudentByID(sid);//findById()
	}
	
	@GetMapping("/getStudent/fname/{fname}")
	Student getStudent(@PathVariable String fname) {
		return studentService.getStudentByFname(fname);//findByname()
	}
	
	
	@PostMapping("/ss")
	Student createStudent(@RequestBody Student s) {
		return studentService.createStudent(s);//created a student
	}
	
	
}
