package com.example.M1Student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	StudentRepo studentRepo;
	
	//add
	public Student add(Student student) {
		return studentRepo.save(student);
	}
	//getAll
	public List<Student> getAll(){
		return studentRepo.findAll();
	}
	//delete
	public String delete(int id) {
		studentRepo.deleteById(id);
		return "id deleted"+id ;
	}
	//update
	public Student update(int id,Student student) {
		Optional<Student> existingStudent=studentRepo.findById(id);
		if(existingStudent.isPresent()) {
			student.setId(id);
			return studentRepo.save(student); 
		}
		else 
			return null;
	}

}
