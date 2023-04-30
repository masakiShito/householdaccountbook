package com.householdaccountbook.domain.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.householdaccountbook.domain.model.entity.Item;

@Mapper
public interface ItemRepository {

	/**
	 * 項目情報全件検索
	 * @param 
	 * @return 検索結果（項目情報）
	 */
	List<Item> selectAll();
	
	/**
	 * 項目情報主キー検索
	 * @param itemCd アイテムコード
	 * @return 検索結果（選択した項目の情報）
	 */
    Item findById(String itemCd);
}
