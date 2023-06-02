package io.github.MatheusFSantos.model.service;

import java.util.List;

public class BankStatementService {
	
	public String getStatementIdentificationData(List<String> pdfContent) {
		String option = "Identificação no extrato: ";
		String statementIdentification = "";
		Integer firstEmptySpacesIndex = 0;
		
		
		for(String lineContent : pdfContent) {
			if(lineContent.toLowerCase().contains(option.toLowerCase())) {
				statementIdentification = lineContent.replaceAll(option, "");
				if(statementIdentification.contains("  "))
					firstEmptySpacesIndex = statementIdentification.indexOf("  ");
				
				if(firstEmptySpacesIndex != 0)
					return statementIdentification.substring(0, firstEmptySpacesIndex); //para remover os espaços em branco que veio do pdf
				
				return statementIdentification;
			}
		}
		
		return statementIdentification;
	}
	
}
