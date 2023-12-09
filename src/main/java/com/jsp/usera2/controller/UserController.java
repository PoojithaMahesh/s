package com.jsp.usera2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.usera2.dao.UserDao;
import com.jsp.usera2.dto.User;
import com.jsp.usera2.service.UserService;
import com.jsp.usera2.util.ResponseStructure;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
    @PostMapping("/save")
	public ResponseStructure<User> saveUser(@RequestBody User user) {
	return	service.saveUser(user);
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

	@GetMapping("/find")
	public ResponseStructure<User> findUserById(@RequestParam int userId) {
		return service.findUserById(userId);
	}
	
	
	
	
	
	
	
	
	
	
	
//	
	@PutMapping("/update")
	public ResponseStructure<User> updateUser(@RequestParam int id,@RequestBody User user) {
		return service.updateUser(id,user);
	}
	
	
	
	
	
	
	
	@DeleteMapping("/delete")
	public ResponseStructure<User> deleteUser(@RequestParam int id) {
		return service.deleteUserById(id);
	}
	
	
	
	
}
