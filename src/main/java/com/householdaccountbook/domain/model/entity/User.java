package com.householdaccountbook.domain.model.entity;

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
	private String deleteFlg;
}
