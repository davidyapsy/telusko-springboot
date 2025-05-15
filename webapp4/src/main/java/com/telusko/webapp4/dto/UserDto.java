package com.telusko.webapp4.dto;

import java.time.LocalDate;

public class UserDto {
	private int id;
	private String emailAddress;
	private String uname;
	private String pwd;
	private LocalDate createdAt=LocalDate.now();
	public UserDto() {}
	public UserDto(int id, String emailAddress, String uname, String pwd, LocalDate createdAt) {
		super();
		this.id = id;
		this.emailAddress = emailAddress;
		this.uname = uname;
		this.pwd = pwd;
		this.createdAt = createdAt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", emailAddress=" + emailAddress + ", uname=" + uname + ", pwd=" + pwd
				+ ", createdAt=" + createdAt + "]";
	}
}
