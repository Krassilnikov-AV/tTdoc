package com.tTdoc.repositories;

/**
 * \* @author AleKras on 01.12.2023
 * \* Description:
 * \*
 */
/*
public interface TechDocRepository extends JpaRepository<Document, Long> {
	List<Document> findByNumberdocument(String numberdocument);

}
*/


import com.tTdoc.models.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, Long> {
	List<Document> findByTitle(String title);
}
