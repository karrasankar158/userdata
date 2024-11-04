package com.fsd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor //@Data
public class UserData {
	private Integer id;
	private String name;
	private String location;

}
