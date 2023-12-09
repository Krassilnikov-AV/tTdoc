package com.tTdoc.repositories;

import com.tTdoc.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * \* @author AleKras on 07.12.2023
 * \* Description:
 * \*
 */
public interface ImageRepository extends JpaRepository<Image, Long> {

}