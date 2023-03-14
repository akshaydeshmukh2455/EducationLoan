package com.webcorestone.EduFinance.app.dto;

//import org.springframework.stereotype.Component;

import lombok.Data;

@Data
//@Component
public class LoginDto 
{
	private String emailId;
	private String password;

	    public boolean validate(String emailId, String password) {

	        if (emailId.equals(this.emailId) && password.equals(this.password)) {
	            return true;
	        }
	        return false;
	    }
	}

