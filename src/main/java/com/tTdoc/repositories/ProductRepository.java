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


import com.tTdoc.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByTitle(String title);
}
