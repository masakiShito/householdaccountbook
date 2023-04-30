package com.householdaccountbook.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {

	private String itemCd;
	private String itemKbm;
	private String itemName;
	private String itemDetail;
	private String insertDate;
	private String updateDate;
	private String deleteFlg;
}
