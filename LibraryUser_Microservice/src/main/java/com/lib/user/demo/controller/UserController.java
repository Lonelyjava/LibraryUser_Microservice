package com.lib.user.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lib.user.demo.dto.UserDto;
import com.lib.user.demo.entity.UserEntity;
import com.lib.user.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	public ResponseEntity<?> saveUserDetails(@RequestBody UserDto userDto){
		
		UserEntity userEntity=userService.saveUserDetails(userDto);
		
		return new ResponseEntity<>(userEntity,HttpStatus.OK);
	}

}
