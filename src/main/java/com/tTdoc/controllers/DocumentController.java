package com.tTdoc.controllers;

/**
 * \* @author AleKras on 25.11.2023
 * \* Description:
 * \*
 */

import com.tTdoc.models.Document;
import com.tTdoc.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class DocumentController {
	private final DocumentService documentService;
	private final AuthorService authorService;

	@GetMapping("/")
	public String documents(@RequestParam(name = "title", required = false) String title, Model model) {
		model.addAttribute("documents", documentService.listDocuments(title));
		return "documents";
	}

	@GetMapping("/document/{id}")
	public String productInfo(@PathVariable Long id, Model model) {
		Document document = documentService.getProductById(id);
		model.addAttribute("document", document);
		model.addAttribute("images", document.getImages());
		return "document-info";
	}

	@PostMapping("/document/create")
	public String createProduct(@RequestParam("file1") MultipartFile file1, @RequestParam("file2") MultipartFile file2,
								@RequestParam("file3") MultipartFile file3, Document document) throws IOException {
		documentService.saveDocument(document, file1, file2, file3);
		return "redirect:/";
	}

//	@GetMapping("/doc/create")
//	public List<Author> getAuthor(@PathVariable Long id, Model model) {
//		List<Author> authors=new ArrayList<>();
//		Author author = authorService.getAuthorById(id);
//		model.addAttribute("selectFio", author.getFio());
//		authors.add(author);
//		return authors;
//	}

	@PostMapping("/doc/create")
	public String createDocument(@RequestParam("file1") MultipartFile file1, @RequestParam("file2") MultipartFile file2,
								 @RequestParam("file3") MultipartFile file3, Document document) throws IOException {

		documentService.saveDocument(document, file1, file2, file3);
		return "redirect:/doc/create";
	}


	@PostMapping("/document/delete/{id}")
	public String deleteProduct(@PathVariable Long id) {
		documentService.deleteProduct(id);
		return "redirect:/";
	}
}
