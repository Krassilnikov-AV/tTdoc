package com.tTdoc.models;

/**
 * \* @author AleKras on 02.12.2023
 * \* Description:
 * \*
 */

/*
@Entity
@Table(name = "images")
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "numberDocument", columnDefinition = "text")
	private String numberDocumet;
	@Column(name = "originalFileName")
	private String originalFileName;
	@Column(name = "size")
	private Long size;
	@Column(name = "contentType")
	private String contentType;
	@Column(name = "isPreviewImage")
	private boolean isPreviewImage;
	@Lob
//	@Type(type = "org.hibernate.type.ImageType")
//	@Column(name = "bytes", columnDefinition = "BLOB NOT NULL")
	private byte[] bytes;
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	private Product temptechdoc;
}*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "images")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "originalFileName")
	private String originalFileName;
	@Column(name = "size")
	private Long size;
	@Column(name = "contentType")
	private String contentType;
	@Column(name = "isPreviewImage")
	private boolean isPreviewImage;
	@Lob
	private byte[] bytes;
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	private Product product;
}

