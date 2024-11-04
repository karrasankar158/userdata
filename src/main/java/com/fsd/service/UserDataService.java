package com.fsd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fsd.model.UserData;

@Service
public class UserDataService {

	public List<UserData> getAllUsers(){
		return List.of(new UserData(101,"Sankar","A.P"),
				new UserData(102,"chandu","Hyderabad"),
				new UserData(103,"sam","U.P"),
				new UserData(104,"kumar","A.p"));
				
	}
}
