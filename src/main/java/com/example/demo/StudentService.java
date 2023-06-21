package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

	@Autowired
	StudentRepository stdrepo;
	
	public List<Student> getStudentList() {
		
		return stdrepo.findAll();
	}
	
	public Student getStudentDetails(int id)throws StudentNotAvaibelinDatabase
	{
		Student std=null;
		try
		{
			std=stdrepo.findById(id).get();
		}
		catch (Exception e) {
			throw new StudentNotAvaibelinDatabase();
		}
		
		return std;
	}
	
	public void createOrUpdateStudent(Student std)
	{
		stdrepo.save(std);
	}

	public void deleteStudentDetails(int id)
	{
		stdrepo.deleteById(id);
	}

}
