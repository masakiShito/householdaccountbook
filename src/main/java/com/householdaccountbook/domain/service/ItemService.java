package com.householdaccountbook.domain.service;

import org.springframework.stereotype.Service;

import com.householdaccountbook.domain.repository.mapper.ItemRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemService {

	private final ItemRepository itemRepository;

	public Object selectAll() {
		return itemRepository.selectAll();
	}
}
