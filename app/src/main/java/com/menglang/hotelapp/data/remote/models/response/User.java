package com.menglang.hotelapp.data.remote.models.response;

import java.util.List;

public class User{
	private String lastName;
	private String profile;
	private List<RolesItem> roles;
	private Object updateAt;
	private Object verifyEmail;
	private String createAt;
	private String changePassword;
	private String firstName;
	private String createBy;
	private String phoneNumber;
	private Object updateBy;
	private int id;
	private String email;
	private String username;
	private String status;

	public String getLastName(){
		return lastName;
	}

	public String getProfile(){
		return profile;
	}

	public List<RolesItem> getRoles(){
		return roles;
	}

	public Object getUpdateAt(){
		return updateAt;
	}

	public Object getVerifyEmail(){
		return verifyEmail;
	}

	public String getCreateAt(){
		return createAt;
	}

	public String getChangePassword(){
		return changePassword;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getCreateBy(){
		return createBy;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public Object getUpdateBy(){
		return updateBy;
	}

	public int getId(){
		return id;
	}

	public String getEmail(){
		return email;
	}

	public String getUsername(){
		return username;
	}

	public String getStatus(){
		return status;
	}
}