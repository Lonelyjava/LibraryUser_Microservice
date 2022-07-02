package com.lib.user.demo.serviceImpl;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;

import com.lib.user.demo.dto.UserDto;
import com.lib.user.demo.entity.UserEntity;
import com.lib.user.demo.reposistory.UserReposistory;
import com.lib.user.demo.service.UserService;

public class UserServiceImpl implements UserService{

	@Autowired
	UserReposistory reposistory;
	@Override
	public UserEntity saveUserDetails(UserDto userDto) {
		UserEntity entity = new UserEntity();
		entity.setName(userDto.getName());
		entity.setEmail(userDto.getEmail());
		entity.setMobile(userDto.getMobile());
		LocalTime localTime =LocalTime.now();
		entity.setCreateDate(localTime);
		reposistory.save(entity);
		return entity;
	}

}
