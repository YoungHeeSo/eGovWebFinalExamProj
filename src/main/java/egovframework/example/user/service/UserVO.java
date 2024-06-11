package egovframework.example.user.service;

import egovframework.example.sample.service.SampleDefaultVO;

public class UserVO extends SampleDefaultVO {
	
	private String userID;
	
	private String name;
	
	private int birthYear;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	
	
}
