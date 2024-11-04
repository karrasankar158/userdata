package com.fsd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.model.UserData;
import com.fsd.service.UserDataService;

@RestController
@RequestMapping("/users")
public class UserDataController {
	
	@Autowired
	private UserDataService userDataService;

	@GetMapping("/all")
	public ResponseEntity<List<UserData>> getAllUsers(){
		List<UserData> allUsers=userDataService.getAllUsers();
	return new ResponseEntity<>(allUsers,HttpStatus.OK);
	}
}
