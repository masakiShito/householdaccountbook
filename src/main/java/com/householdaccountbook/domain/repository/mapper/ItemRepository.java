package com.householdaccountbook.domain.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.householdaccountbook.domain.model.entity.Item;

@Mapper
public interface ItemRepository {

	List<Item> selectAll();
}
