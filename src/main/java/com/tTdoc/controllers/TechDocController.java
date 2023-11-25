package com.tTdoc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * \* @author AleKras on 25.11.2023
 * \* Description:
 * \*
 */
@Controller
public class TechDocController {

	@GetMapping("/")
	public String techDocuments() {
		return "techDocuments";
	}
}