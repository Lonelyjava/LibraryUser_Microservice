package com.lib.user.demo.serviceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lib.user.demo.dto.UserDto;
import com.lib.user.demo.entity.UserEntity;
import com.lib.user.demo.reposistory.UserReposistory;
import com.lib.user.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserReposistory reposistory;
	@Override
	public UserEntity saveUserDetails(UserDto userDto) {
		UserEntity entity = new UserEntity();
		entity.setName(userDto.getName());
		entity.setEmail(userDto.getEmail());
		entity.setMobile(userDto.getMobile());
		LocalDateTime localTime =LocalDateTime.now();
		entity.setCreateDate(localTime);
		reposistory.save(entity);
		return entity;
	}
	@Override
	public List<UserEntity> gateUserDetails() {
		List<UserEntity> userList = new  ArrayList<>();
		UserEntity entity = new UserEntity();
		entity.setId(1);
		entity.setName("kundan");
		entity.setEmail("kumarkundan784@gmail.com");
		entity.setMobile("8802292341");
		LocalDateTime localTime =LocalDateTime.now();
		entity.setCreateDate(localTime);
		userList.add(entity);
		return userList;
	}

}
