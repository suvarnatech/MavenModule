package com.venkatesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venkatesh.dto.StudentDto;
import com.venkatesh.operation.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/welcome")
	public ResponseEntity<String> getMessage() {

		return new ResponseEntity<>("Welcome to Student Application" +studentService.getMessage(), HttpStatus.OK);
	}
	
	@GetMapping("/message")
	public ResponseEntity<StudentDto> serviceMessage() {

		return new ResponseEntity<>(studentService.getStudentDetails(), HttpStatus.OK);
	}

}
