package com.tTdoc.controllers;

import com.tTdoc.models.TempTechDoc;
import com.tTdoc.services.TempTechDocService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * \* @author AleKras on 25.11.2023
 * \* Description:
 * \*
 */
@Controller
@RequiredArgsConstructor
public class TempTechDocController {

	private final TempTechDocService tempTechDocService;

//	public TempTechDocController(TempTechDocService tempTechDocService) {
//		this.tempTechDocService = tempTechDocService;
//	}

	@GetMapping(value = "/")
	public String techDocuments(@RequestParam(name = "numberDocument", required = false) String numberDocument, Model model) {
		model.addAttribute("tempTechDocs", tempTechDocService.listTempTechDocs(numberDocument));
		return "tempTechDocs";
	}

	@GetMapping("/tempTechDoc/{id}")
	public String tempTechDocInfo(@PathVariable Long id, Model model) {
		model.addAttribute("tempTechDoc", tempTechDocService.getTempTechDocById(id));
		return "tempTechDoc-info";
	}


	@PostMapping("/tempTechDoc/create")
	public String createTempTechDoc(TempTechDoc tempTechDoc) {
		tempTechDocService.saveTempTechDoc(tempTechDoc);
		return "redirect:/";
	}

	@PostMapping("/tempTechDocs/delete/{id}")
	public String deleteTempTechDoc(@PathVariable Long id) {
		tempTechDocService.deleteTempTechDoc(id);
		return "redirect:/";
	}
}