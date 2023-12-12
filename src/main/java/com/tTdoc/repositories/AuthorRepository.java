package com.tTdoc.repositories;

import com.tTdoc.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * \* @author AleKras on 10.12.2023
 * \* Description:
 * \*
 */
public interface AuthorRepository extends JpaRepository<Author, Long> {
	List<Author> findByFio(String fio);

}