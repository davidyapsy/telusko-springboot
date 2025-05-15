package com.telusko.webapp4.service;

import java.util.List;

import com.telusko.webapp4.dto.UserDto;

public interface IUserService {
	String addUser(UserDto user);
	int rowCount();
	List<UserDto> getAllUser();
}
