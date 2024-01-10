package com.example.Dto;

public class UserDTO {
	
	private int userid;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	private String username;
	private String email;
	private String password;
	private String confirmpassword;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	@Override
	public String toString() {
		return "UserDTO [username=" + username + ", email=" + email + ", password=" + password + ", confirmpassword="
				+ confirmpassword + "]";
	}
	public UserDTO() {
		super();
	}
//	public UserDTO(String username, String email, String password, String confirmpassword) {
//		super();
//		this.username = username;
//		this.email = email;
//		this.password = password;
//		this.confirmpassword = confirmpassword;
//		
//	}
//	
//	
	
}
