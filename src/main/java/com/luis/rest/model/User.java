package com.luis.rest.model;

public class User {
	
	private String nickName;
	private String user;
	private String password;
	
	
	public User(String nickName, String user, String password) {
		this.nickName = nickName;
		this.user = user;
		this.password = password;
	}
	
	
	public User() {
		
	}


	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
