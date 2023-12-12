package com.tTdoc.models;

import lombok.*;

import javax.persistence.*;

/**
 * \* @author AleKras on 10.12.2023
 * \* Description:
 * \*
 */


@Entity
@Table(name = "authors")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "fio", columnDefinition = "text")
	private String fio;
	@Column(name = "city", columnDefinition = "text")
	private String city;
}