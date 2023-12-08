package com.jsp.usera2.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id
	private int id;
	private String name;
	private String address;
	private long phone;
	
	
}
