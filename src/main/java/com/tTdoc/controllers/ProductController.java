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


import com.tTdoc.models.Product;
import com.tTdoc.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class ProductController {
	private final ProductService productService;

	@GetMapping("/")
	public String products(@RequestParam(name = "title", required = false) String title, Model model) {
		model.addAttribute("products", productService.listProducts(title));
		return "products";
	}

	@GetMapping("/product/{id}")
	public String productInfo(@PathVariable Long id, Model model) {
		Product product = productService.getProductById(id);
		model.addAttribute("product", product);
		model.addAttribute("images", product.getImages());
		return "product-info";
	}

	@PostMapping("/product/create")
	public String createProduct(@RequestParam("file1") MultipartFile file1, @RequestParam("file2") MultipartFile file2,
								@RequestParam("file3") MultipartFile file3, Product product) throws IOException {
		productService.saveProduct(product, file1, file2, file3);
		return "redirect:/";
	}

	@PostMapping("/product/delete/{id}")
	public String deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
		return "redirect:/";
	}
}
