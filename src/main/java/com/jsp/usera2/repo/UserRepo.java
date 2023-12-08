package com.jsp.usera2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.usera2.dto.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
