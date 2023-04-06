package com.householdaccountbook.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

	private String userId;
	private String userName;
	private String password;
	private String insertDate;
	private String updateDate;
}
