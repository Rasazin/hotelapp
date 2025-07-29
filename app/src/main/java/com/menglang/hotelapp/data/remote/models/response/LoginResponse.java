package com.menglang.hotelapp.data.remote.models.response;

public class LoginResponse{
	private int expiresIn;
	private String accessToken;
	private String tokenType;
	private User user;
	private String refreshToken;

	public int getExpiresIn(){
		return expiresIn;
	}

	public String getAccessToken(){
		return accessToken;
	}

	public String getTokenType(){
		return tokenType;
	}

	public User getUser(){
		return user;
	}

	public String getRefreshToken(){
		return refreshToken;
	}
}
