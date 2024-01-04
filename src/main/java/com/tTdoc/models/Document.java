package com.tTdoc.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.*;

/**
 * \* @author AleKras on 25.11.2023
 * \* Description:
 * \*
 */
/*
@Entity
@Table(name = "tempdocs")
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "numberDocument")
	private String numberdocument;
	@Column(name = "description", columnDefinition = "text")
	private String description;
	@Column(name = "idDetail")
	private Long idDetail;
	@Column(name = "idAuthor", columnDefinition = "text")
	private String idAuthor;
	@Column(name = "validityPeriod")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate validityPeriod;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "reasonCod")
	private int reasonCod;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
		mappedBy = "tempdoc")
	private List<Image> images = new ArrayList<>();
	private Long previewImageId;
	private LocalDateTime dateOfCreated;

	@PrePersist
	private void init() {
		dateOfCreated = LocalDateTime.now();
	}

	public void addImageToTechDoc(Image imagetechdoc) {
		imagetechdoc.setTemptechdoc(this);
		images.add(imagetechdoc);
	}
}
*/
/*
 */

@Entity
@Table(name = "documents")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "title", columnDefinition = "text")
	private String title;
	@Column(name = "description", columnDefinition = "text")
	private String description;
	@Column(name = "price")  // дата окончания
	private int price;
	@Column(name = "city")   // количество. шт
	private String city;
	@Column(name = "author")   // id автора
	private String author;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
		mappedBy = "document")
	private List<Image> images = new ArrayList<>();
	private Long previewImageId;
	private LocalDateTime dateOfCreated;

	@PrePersist
	private void init() {
		dateOfCreated = LocalDateTime.now();
	}

	public void addImageToProduct(Image image) {
		image.setDocument(this);
		images.add(image);
	}
}
