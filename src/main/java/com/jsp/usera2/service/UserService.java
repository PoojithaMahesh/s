package com.jsp.usera2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.usera2.dao.UserDao;
import com.jsp.usera2.dto.User;
import com.jsp.usera2.util.ResponseStructure;

@Service
public class UserService {
	@Autowired
    private UserDao dao;
	public ResponseStructure<User> saveUser(User user) {
	User dbUser=dao.saveUser(user);
		ResponseStructure<User> structure=new ResponseStructure<>();
		structure.setMessage("User Data Saved successfully");
		structure.setHttpStatus(HttpStatus.CREATED.value());
		structure.setData(dbUser);
		return structure;
	}
	public ResponseStructure<User> findUserById(int userId) {
		User dbUser=dao.findUserById(userId);
		if(dbUser!=null) {
//			id is present 
			ResponseStructure<User> structure=new ResponseStructure<>();
			structure.setMessage("User Data fetched successfully");
			structure.setHttpStatus(HttpStatus.FOUND.value());
			structure.setData(dbUser);
			return structure;
		}else {
//			id is not present
			ResponseStructure<User> structure=new ResponseStructure<>();
			structure.setMessage("User Data NOT FOUND");
			structure.setHttpStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(null);
			return structure;
		}
	}
	public ResponseStructure<User> updateUser(int id, User user) {
		User dbUser=dao.updateUser(id, user);
		if(dbUser!=null) {
//			id is present 
			ResponseStructure<User> structure=new ResponseStructure<>();
			structure.setMessage("User Data Updated successfully");
			structure.setHttpStatus(HttpStatus.OK.value());
			structure.setData(dbUser);
			return structure;
		}else {
//			id is not present
			ResponseStructure<User> structure=new ResponseStructure<>();
			structure.setMessage("User Data NOT FOUND");
			structure.setHttpStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(null);
			return structure;
		}
	}
	public ResponseStructure<User> deleteUserById(int id) {
		User dbUser=dao.deleteUserById(id);
		if(dbUser!=null) {
//			id is present 
			ResponseStructure<User> structure=new ResponseStructure<>();
			structure.setMessage("User Data Deleted successfully");
			structure.setHttpStatus(HttpStatus.FOUND.value());
			structure.setData(dbUser);
			return structure;
		}else {
//			id is not present
			ResponseStructure<User> structure=new ResponseStructure<>();
			structure.setMessage("User Data NOT FOUND");
			structure.setHttpStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(null);
			return structure;
		}
	}

	
}
