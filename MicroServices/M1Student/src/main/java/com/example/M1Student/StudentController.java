package com.example.M1Student;

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

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	//get
	@GetMapping("/getAll")
	public List<Student> getAllStudent(){
		return studentService.getAll();
	}
	//add
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return studentService.add(student);
	}
	//delete
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return studentService.delete(id);
		
	}
	//update
	@PutMapping("/update/{id}")
	public Student updateStudent(@RequestBody  int id,Student student) {
		return studentService.update(id, student);
	}
}
