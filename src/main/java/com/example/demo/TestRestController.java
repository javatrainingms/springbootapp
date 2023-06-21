package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	@RequestMapping("test")  //get    post	put	delete
	public String test()
	{
		return "this is some data";
	}
	

	@GetMapping("getTest")    //get 
	public String getTest()
	{
		return "this is some data";
	}

	@PostMapping("posttest")   //post 
	public String posttest()
	{
		return "this is some data";
	}
	
	@PutMapping("puttest")   //put 
	public String puttest()
	{
		return "this is some data";
	}
	
	@DeleteMapping("deletetest")   //delete 
	public String deletetest()
	{
		return "this is some data";
	}
}
