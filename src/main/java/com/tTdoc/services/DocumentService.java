package com.tTdoc.services;

/*
import com.tTdoc.models.*;
import com.tTdoc.repositories.TechDocRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * \* @author AleKras on 25.11.2023
 * \* Description:
 * \*
 *//*
@Service
@Slf4j
@RequiredArgsConstructor
public class DocumentService {

	private final TechDocRepository techdocRepository;

	public List<Document> listTempTechDocs(String numberdocument) {
		if (numberdocument != null) return techdocRepository.findByNumberdocument(numberdocument);
		return techdocRepository.findAll();
	}

	public void saveTempTechDoc(Document temptechdoc, MultipartFile file1,
								MultipartFile file2, MultipartFile file3
	) throws IOException {
		Image image1;
		Image image2;
		Image image3;
		if (file1.getSize() != 0) {
			image1 = toImageEntity(file1);
			image1.setPreviewImage(true);
			temptechdoc.addImageToTechDoc(image1);
		}
		if (file2.getSize() != 0) {
			image2 = toImageEntity(file2);
			temptechdoc.addImageToTechDoc(image2);
		}
		if (file3.getSize() != 0) {
			image3 = toImageEntity(file3);
			temptechdoc.addImageToTechDoc(image3);
		}
		log.info("Saving new Document. numberdocument: {}; Author: {}", temptechdoc.getNumberdocument(),
			temptechdoc.getIdAuthor());
		Document temptechdocFromDb = techdocRepository.save(temptechdoc);
		temptechdocFromDb.setPreviewImageId(temptechdocFromDb.getImages().get(0).getId());
		techdocRepository.save(temptechdoc);
	}

	private Image toImageEntity(MultipartFile file) throws IOException {
		Image image = new Image();
		image.setNumberDocumet(file.getName());
		image.setOriginalFileName(file.getOriginalFilename());
		image.setContentType(file.getContentType());
		image.setSize(file.getSize());
		image.setBytes(file.getBytes());
		return image;
	}

	public void deleteTempTechDoc(long id) {
		techdocRepository.deleteById(id);
	}

	public Document getTempTechDocById(Long id) {
		return techdocRepository.findById(id).orElse(null);
	}
}*/


import com.tTdoc.models.*;
import com.tTdoc.repositories.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;

@Service
@Slf4j
@RequiredArgsConstructor
public class DocumentService {
	private final DocumentRepository documentRepository;

	public List<Document> listDocuments(String title) {
		if (title != null) return documentRepository.findByTitle(title);
		return documentRepository.findAll();
	}


	public void saveDocument(Document document, MultipartFile file1,
							MultipartFile file2, MultipartFile file3) throws IOException {
		Image image1;
		Image image2;
		Image image3;
		if (file1.getSize() != 0) {
			image1 = toImageEntity(file1);
			image1.setPreviewImage(true);
			document.addImageToProduct(image1);
		}
		if (file2.getSize() != 0) {
			image2 = toImageEntity(file2);
			document.addImageToProduct(image2);
		}
		if (file3.getSize() != 0) {
			image3 = toImageEntity(file3);
			document.addImageToProduct(image3);
		}
		log.info("Saving new Document. Title: {}; Author: {}", document.getTitle(), document.getAuthor());
		Document documentFromDb = documentRepository.save(document);
		documentFromDb.setPreviewImageId(documentFromDb.getImages().get(0).getId());
		documentRepository.save(document);
	}

	private Image toImageEntity(MultipartFile file) throws IOException {
		Image image = new Image();
		image.setName(file.getName());
		image.setOriginalFileName(file.getOriginalFilename());
		image.setContentType(file.getContentType());
		image.setSize(file.getSize());
		image.setBytes(file.getBytes());
		return image;
	}

	public void deleteProduct(Long id) {
		documentRepository.deleteById(id);
	}

	public Document getProductById(Long id) {
		return documentRepository.findById(id).orElse(null);
	}
}
