package com.venkatesh.operation;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.venkatesh.constants.StudentConstants;
import com.venkatesh.dto.StudentDto;

@Service
public class StudentService {

	public String getMessage() {

		return StudentConstants.STUDENT_MESSAGE;
	}

	public StudentDto getStudentDetails() {
		StudentDto studentDto = new StudentDto();
		studentDto.setStudentId(UUID.randomUUID().toString());
		studentDto.setStudentName("Sukanya");
		studentDto.setStudentClass("Ph.D");
		return studentDto;
	}
}
