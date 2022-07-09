package com.lib.user.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lib.user.demo.dto.UserDto;
import com.lib.user.demo.entity.UserEntity;
import com.lib.user.demo.response.ApiResponse;
import com.lib.user.demo.service.UserService;


@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	
//	@Autowired
//	RestTemplate restTemplate;
	
	
	@RequestMapping("/saveUser")
	public ResponseEntity<?> saveUserDetails(@RequestBody UserDto userDto){
		
		ApiResponse api = new ApiResponse();
		
		UserEntity userEntity=userService.saveUserDetails(userDto);
		
		api.setResponseMessgae("saved successfully..");
		api.setResponseCode(200);
		api.setResponseError(false);
		api.setData(userEntity);
		
		return new ResponseEntity<>(api,HttpStatus.OK);
	}
	
	
	@GetMapping("/getUser")
	public ResponseEntity<?> getUserDetails(){
		
		ApiResponse api = new ApiResponse();
		
		List<UserEntity> userEntity=userService.gateUserDetails();
		api.setResponseMessgae("saved successfully..");
		api.setResponseCode(200);
		api.setResponseError(false);
		api.setData(userEntity);
		
		return new ResponseEntity<>(api,HttpStatus.OK);
	}

}
