package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {
	@Autowired
	StudentService stdService;
	
	@GetMapping("getStdlist")
	public List<Student> getStudentList()
	{
		return stdService.getStudentList();
	}
	
	
	@GetMapping("getStudentDetails")
	public Student getStudentDetails(@RequestParam("id") int id)throws StudentNotAvaibelinDatabase
	{
		return stdService.getStudentDetails(id);
	}
	
	
	@PostMapping("createStudent")
	public String createStudent(@RequestBody Student std)
	{
		stdService.createOrUpdateStudent(std);
		return "success";
	}
	
	@PutMapping("updateStudent")
	public String updateStudent(@RequestBody Student std)
	{
		stdService.createOrUpdateStudent(std);
		return "success";
	}
	
	@DeleteMapping("deleteStudent")
	public String deleteStudent(@RequestParam int id)
	{
		stdService.deleteStudentDetails(id);
		return "success";
	}
}
