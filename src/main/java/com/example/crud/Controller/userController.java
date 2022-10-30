package com.example.crud.Controller;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.entity.Course;
import com.example.crud.entity.User;
import com.example.crud.repository.UserRepository;


@CrossOrigin("*")
@RestController
public class userController {
	 @Autowired private UserRepository userRepository;
	 
	@PostMapping("/users/{email}")
	public ResponseEntity checkLogin(@PathVariable String email, @RequestBody User user){
		System.out.println("check login called");
		User userResult =  userRepository.findByEmail(email);
		
		
		  if(userResult == null) { return new ResponseEntity(HttpStatus.NOT_FOUND); }
		  
		  if(!userResult.getPassword().equals(user.getPassword())) { return new
		  ResponseEntity(HttpStatus.NOT_FOUND); }
		 
		  HttpHeaders httpHeaders = new HttpHeaders();
	      httpHeaders.setContentType(new MediaType("text", "plain", StandardCharsets.UTF_8));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/registerUser")
	public User registerUser(@RequestBody Course course) {
		 return  userRepository.save(null);
	}
	@GetMapping("/getUser")
	public List<User> getCourse(){
				return userRepository.findAll();
		
	}
}
