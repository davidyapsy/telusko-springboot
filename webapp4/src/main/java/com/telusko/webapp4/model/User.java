package com.telusko.webapp4.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	private int id;
	@Column(name="email_address")
	private String emailAddress;
	@Column(name="username")
	private String uname;
	@Column(name="upassword")
	private String pwd;
	@Column(name="created_at")
	private LocalDate createdAt;
	public User() {}
	public User(int id, String emailAddress, String uname, String pwd, LocalDate createdAt) {
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
		return "User [id=" + id + ", emailAddress=" + emailAddress + ", uname=" + uname + ", pwd=" + pwd
				+ ", createdAt=" + createdAt + "]";
	}
}
