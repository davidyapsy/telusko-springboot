package com.telusko.webapp4.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.webapp4.dto.UserDto;
import com.telusko.webapp4.model.User;
import com.telusko.webapp4.repo.IUserRepo;

@Service
public class UserService implements IUserService{

	@Autowired
	private IUserRepo repo;
	
	@Override
	public String addUser(UserDto userdto) {
		User user = new User();
		try {
			BeanUtils.copyProperties(userdto, user);
			String uName = repo.save(user).getUname();
			return "User with name: "+uName+" has been registered";
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "Failed to add user";
	}

	@Override
	public int rowCount() {
		return repo.getRowCount();
	}

	@Override
	public List<UserDto> getAllUser() {
		List<UserDto> userdtoList = new ArrayList<>();
		BeanUtils.copyProperties(repo.findAll(), userdtoList);
		return userdtoList;
	}

}
