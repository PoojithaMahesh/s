package com.jsp.usera2.dto;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id
	private int id;
    @NotNull(message = "Name should not be null")
    @NotBlank(message = "Name should not be blank")
	private String name;
    @NotNull(message = "Address should not be null")
    @NotBlank(message = "Address should not be blank")
	private String address;
    @Min(6000000000l)
    @Max(9999999999l)
	private long phone;
	
	
}
