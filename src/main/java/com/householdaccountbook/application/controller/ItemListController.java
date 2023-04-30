package com.householdaccountbook.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.householdaccountbook.domain.model.entity.Item;
import com.householdaccountbook.domain.service.ItemService;

@Controller
public class ItemListController {

	@Autowired
	private ItemService itemService;

	/**
	 * 項目一覧画面を表示
	 * @param 
	 * @return 項目一覧画面
	 */
	@GetMapping("/item/itemlist")
	public String listAll(Model model) {
		
		List<Item> itemList = itemService.selectAll();
		model.addAttribute("itemList", itemList);
		return "item/itemlist";
		
	}
	
	/**
	 * 項目登録画面を表示
	 * @param 
	 * @return 項目登録画面
	 */
	@GetMapping("/item/iteminsert")
	public String showItemInsert() {
		
		return "item/iteminsert";
	}
	
	/**
	 * 項目編集画面を表示
	 * @param itemCd 項目コード
	 * @return 項目編集画面
	 */
	@PostMapping("/item/itemedit")
	public String showItemEdit(String itemCd, Model model) {
		Item item = itemService.findById(itemCd);
		
		model.addAttribute("item", item);
		return "item/itemedit";
	}

	@PostMapping("/back")
	String back() {
		return "redirect:/";
	}
}