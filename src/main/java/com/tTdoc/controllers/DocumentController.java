package com.tTdoc.controllers;

/**
 * \* @author AleKras on 25.11.2023
 * \* Description:
 * \*
 *//*
@Controller
@RequiredArgsConstructor
public class DocumentController {

	private final DocumentService temptechdocService;

	@GetMapping(value = "/")
//	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String techDocuments(@RequestParam(name = "numberdocument", required = false)
									String numberdocument, Model model) {
		model.addAttribute("temptechdoc", temptechdocService.listTempTechDocs(numberdocument));
		return "temptechdocs";
	}

	@GetMapping("/temptechdoc/{id}")
	public String temptechdocInfo(@PathVariable Long id, Model model) {
		Document temptechdoc = temptechdocService.getTempTechDocById(id);
		model.addAttribute("temptechdoc", temptechdoc);
		model.addAttribute("images", temptechdoc.getImages());
		return "temptechdoc-info";
	}

	@PostMapping(value = "/temptechdoc/create")
	public String createTempTechDoc(@RequestParam("file1") MultipartFile file1,
									@RequestParam("file2") MultipartFile file2,
									@RequestParam("file3") MultipartFile file3,
									Document temptechdoc) throws IOException {
		temptechdocService.saveTempTechDoc(temptechdoc, file1, file2, file3);
		return "redirect:/";
	}
	@PostMapping("/temptechdoc/delete/{id}")
	public String deleteTempTechDoc(@PathVariable Long id) {
		temptechdocService.deleteTempTechDoc(id);
		return "redirect:/";
	}
}
*/


import com.tTdoc.models.Document;
import com.tTdoc.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class DocumentController {
	private final ProductService productService;

	@GetMapping("/")
	public String products(@RequestParam(name = "title", required = false) String title, Model model) {
		model.addAttribute("documents", productService.listProducts(title));
		return "documents";
	}

	@GetMapping("/document/{id}")
	public String productInfo(@PathVariable Long id, Model model) {
		Document document = productService.getProductById(id);
		model.addAttribute("document", document);
		model.addAttribute("images", document.getImages());
		return "document-info";
	}

	@PostMapping("/document/create")
	public String createProduct(@RequestParam("file1") MultipartFile file1, @RequestParam("file2") MultipartFile file2,
								@RequestParam("file3") MultipartFile file3, Document document) throws IOException {
		productService.saveProduct(document, file1, file2, file3);
		return "redirect:/";
	}

	@PostMapping("/document/delete/{id}")
	public String deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
		return "redirect:/";
	}
}
