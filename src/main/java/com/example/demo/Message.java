package com.example.demo;

import org.springframework.stereotype.Component;


@Entity
public class Message {
	
	private String message= "Hello World!!";
	


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageEntity [message=" + message + "]";
	}
	
	

}
