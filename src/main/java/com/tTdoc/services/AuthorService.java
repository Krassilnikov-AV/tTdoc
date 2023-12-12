package com.tTdoc.services;

import com.tTdoc.models.Author;
import com.tTdoc.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * \* @author AleKras on 10.12.2023
 * \* Description:
 * \*
 */

@Service
@Slf4j
@RequiredArgsConstructor
public class AuthorService {

	private final AuthorRepository authorRepository;

	public List<Author> listAuthors(String fio) {
		if (fio != null) return authorRepository.findByFio(fio);
			return authorRepository.findAll();
	}

	public void saveAuthor(Author author) {
		log.info("Saving new Document. Id: {}; Name: {}", author.getId(), author.getFio());
		authorRepository.save(author);
	}

	public Author getAuthorById(Long id) {
		return authorRepository.findById(id).orElse(null);
	}
}