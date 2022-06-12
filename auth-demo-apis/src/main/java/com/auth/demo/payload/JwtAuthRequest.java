package com.auth.demo.payload;

import lombok.Data;

@Data
public class JwtAuthRequest {

	private String username;
	
	private String password;
	
}