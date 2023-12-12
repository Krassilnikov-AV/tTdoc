package com.tTdoc.controllers;

import com.tTdoc.models.Author;
import com.tTdoc.services.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * \* @author AleKras on 10.12.2023
 * \* Description:
 * \*
 */


@Controller
@RequiredArgsConstructor
public class AuthorController {
	private  AuthorService authorService;


	@GetMapping("/authors")
	public String authors(@RequestParam(name = "fio", required = false) String fio, Model model) {
		model.addAttribute("authors", authorService.listAuthors(fio));
		return "authors";
	}

	@PostMapping("/author/create")
	public String createAuthor(Author author) {
		authorService.saveAuthor(author);
		return "redirect:/authors";
	}


	@GetMapping("/author/{id}")
	public String authorInfo(@PathVariable Long id, Model model) {
		Author author = authorService.getAuthorById(id);
		model.addAttribute("author", author);
		return "author-info";
	}
}