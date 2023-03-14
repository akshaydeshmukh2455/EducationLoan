package com.webcorestone.EduFinance.app.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@NotEmpty(message = "Sid not be null")
	private int sid;
	
	@NotEmpty(message = "Title must not be null")
	private String title;
	
	@NotEmpty(message = "Firstname must not be null")
	@Size(min = 2,max = 16)
	private String firstName;
	
	@NotEmpty(message = "Middlename must not be null")
	@Size(min = 2,max = 16)
	private String middleName;
	
	@NotEmpty(message = "Lastname must not be null")
	@Size(min = 2,max = 16)
	private String lastName;
	
	@NotEmpty(message = "Mobile Number must not be null")
	@Size(min = 10,max = 10)
	private String mobNo;
	
	@NotEmpty(message = "Email must not be null")
	@Email
	private String emailId;
	@NotEmpty(message = "Password not be null")
	
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$",message = "Password Must contain atleast 8 character 1 digit, 1 lowercase, 1 uppercase, 1 special characters")
	private String password;
	
	@NotEmpty(message = "confirmPassword not be null")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$",message = "Password Must contain atleast 8 character 1 digit, 1 lowercase, 1 uppercase, 1 special characters")
	private String confirmPassword;
}
