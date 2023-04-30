package com.householdaccountbook.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.householdaccountbook.domain.model.entity.Item;
import com.householdaccountbook.domain.repository.mapper.ItemRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemService {

	private final ItemRepository itemRepository;

    /**
     * 項目情報全件検索
     * @return 検索結果
     */
	public List<Item> selectAll() {
		return itemRepository.selectAll();
	}
	
    /**
     * 項目情報主キー検索
     * @return 検索結果
     */
    public Item findById(String itemCd) {
        return itemRepository.findById(itemCd);
    }
}
