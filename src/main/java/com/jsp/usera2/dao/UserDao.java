package com.jsp.usera2.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.usera2.dto.User;
import com.jsp.usera2.repo.UserRepo;

@Repository
public class UserDao {

	@Autowired
	private UserRepo repo;

	public User saveUser(User user) {
		return repo.save(user);
	}

	public User findUserById(int userId) {
		Optional<User> optional=repo.findById(userId);
		if(optional.isPresent()) {
			User user=optional.get();
			return user;
		}else {
//			id is not present in the database so that optional is empty
			return null;
		}
	}
	public User updateUser(int id, User user) {
		Optional<User> optional=repo.findById(id);
		if(optional.isPresent()) {
//			user is present
			user.setId(id);
			return repo.save(user);
		}	
		return null;
	}

	public User deleteUserById(int id) {
		Optional<User> optional=repo.findById(id);
		
		if(optional.isPresent()) {
			User user=optional.get();
//			repo.delete(user);
			repo.deleteById(id);
			return user;
		}
		return null;
		
	}
}
