package com.trangile.prototype.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trangile.prototype.dto.SearchForm;
import com.trangile.prototype.service.SearchService;

@Controller
@RequestMapping(value = "/rc")
public class RcConroller {
	
	private SearchService service;
	
	@PostMapping(value = "/search")
	public String getSearchResult(SearchForm form) {
		System.out.println(form);
		return "Excel File is being downloaded.";
	}

}
