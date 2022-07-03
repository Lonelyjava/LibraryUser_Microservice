package com.lib.user.demo.service;

import java.util.List;

import com.lib.user.demo.dto.UserDto;
import com.lib.user.demo.entity.UserEntity;

public interface UserService {
	
	
	public UserEntity saveUserDetails(UserDto userDto);
	
	
	public List<UserEntity> gateUserDetails();

}
