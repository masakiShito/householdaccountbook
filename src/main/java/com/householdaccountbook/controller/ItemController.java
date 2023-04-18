package com.householdaccountbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.householdaccountbook.domain.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;

	@GetMapping("/list")
	public ModelAndView listAll() {

		ModelAndView mav = new ModelAndView("list");

		mav.addObject("items", itemService.selectAll());

		return mav;

	}

}