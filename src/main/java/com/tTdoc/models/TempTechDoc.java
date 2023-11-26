package com.tTdoc.models;

import lombok.*;

/**
 * \* @author AleKras on 25.11.2023
 * \* Description:
 * \*
 */
@Data
@AllArgsConstructor
public class TempTechDoc {

	//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
	private Long id;
//	@Column(name = "numberDocument")
	private String numberDocument;
	//	@Column(name = "id")
	private int id_detail;
	//	@Column(name = "reasonCod")
	private int reasonCod;
	//	@Column(name = "validityPeriod")
//	private LocalDate validityPeriod;
	//	@Column(name = "quantity")
	private int quantity;
	//	@Column(name = "numberOperation")
	private int numberOperation;
	//	@Column(name = "nameEquipment")
	private String nameEquipment;
	//	@Column(name = "inventoryNumber")
	private int inventoryNumber;
	//	@Column(name = "timeMachine")
	private int timeMachine;
	//	@Column(name = "timeOperation")
	private int timeOperation;
	//	@Column(name = "jobСategory")
	private int jobСategory;
	//	@Column(name = "machineTool")
	private int machineTool;
	//	@Column(name = "description")
	private String description;
	//	@Column(name = "author")
	private String author;

}