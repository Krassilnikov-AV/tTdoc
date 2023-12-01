package com.tTdoc.services;

import com.tTdoc.models.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

/**
 * \* @author AleKras on 25.11.2023
 * \* Description:
 * \*
 */
@Service
public class TempTechDocService {

	private List<TempTechDoc> tempTechDocs = new ArrayList<>();
	private long ID = 0;

	{

		tempTechDocs.add(new TempTechDoc(++ID, "134-108-21", 5,
			4689, LocalDate.of(2023,12,23), 1, 56,
			"351", 68186, 5, 6,
			4, 2, "торец Д", "Синицин А.Г."));

		tempTechDocs.add(new TempTechDoc(++ID, "134-259-21", 5,
			4689, LocalDate.of(2023,12,23), 1, 56,
			"351", 68186, 5, 6,
			4, 2, "торец Д", "Синицин А.Г."));
	}

	public TempTechDoc getTempTechDocById(Long id) {

		for (TempTechDoc tempTechDoc : tempTechDocs) {
			if (tempTechDoc.getId().equals(id)) return tempTechDoc;
		}
		return null;
	}


	public List<TempTechDoc> listTempTechDocs(String numberDocument) {
		return tempTechDocs;
	}

	public void saveTempTechDoc(TempTechDoc tempTechDoc) {
		tempTechDoc.setId(++ID);
		tempTechDocs.add(tempTechDoc);
	}

	public void deleteTempTechDoc(long id) {
		tempTechDocs.removeIf(tempTechDoc -> tempTechDoc.getId().equals(id));
	}
}