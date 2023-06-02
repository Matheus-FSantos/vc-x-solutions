package io.github.MatheusFSantos.model.service;

import java.util.List;

/**
 * 
 * <h1 align='center'>BankStatementService</h1>
 * <hr>
 * <p>
 * 	Classe de serviço que fará algumas operações relacionadas ao extrato da conta bancária.
 * 	Será muito importante no sistema pois fará a busca nos dados do PDF e retornará eles, de forma bruta, em seus devidos objetos
 * </p>
 * 
 * 
 * @author Matheus Ferreira Santos
 * @category Class
 * @since 1.0
 * 
 */
public class BankStatementService {
	
	/**
	 * 
	 * <h1 align='center'>getStatementIdentificationData</h1>
	 * <hr>
	 * <p>
	 * 	Método responsável por acessar o conteúdo do PDF, que é uma Lista de String, onde cada indice é uma linha do PDF informado,
	 * 	e retornar para outra classe uma String que terá, como conteúdo principal, o valor da "identificação no extrato",
	 * 	que está presente no PDF, presente em "src/main/resources"
	 * </p>
	 * 
	 * @author Matheus Ferreira Santos
	 * @category Method
	 * @param pdfContent
	 * @return Account
	 * @since 1.0
	 * 
	 */
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
