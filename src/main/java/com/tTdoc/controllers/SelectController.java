package com.tTdoc.controllers;

import com.tTdoc.models.SelectBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * \* @author AleKras on 13.12.2023
 * \* Description:
 * \*
 */

@Controller
public class SelectController {

	// Annotation
	@RequestMapping(value = "/app")
	public String view(Model model) {
		SelectBean sel = new SelectBean();
		model.addAttribute("select", sel);
		return "select";
	}

	// Annotation
	@ModelAttribute("educationDetails")
	public List<String> educationDetailsList()	{
		List<String> educationList = Arrays.asList(
			"10th class", "Intermediate", "Graduation",
			"Post Graduation");
		return educationList;
	}

	// Annotation
	@RequestMapping(value = "/submit",	method = RequestMethod.POST)
	public String submit(@ModelAttribute("select") SelectBean select)	{
		return "selectSummary";
	}
}