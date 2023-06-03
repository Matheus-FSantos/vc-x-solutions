package io.github.MatheusFSantos.model.service;

import java.util.Arrays;
import java.util.List;

import io.github.MatheusFSantos.model.domain.Account;

/**
 * 
 * <h1 align='center'>AccountService</h1>
 * <hr>
 * <p>
 * 	Classe de serviço que fará algumas operações relacionadas a conta que teve seu dinheiro debitado na "fatura".
 * 	Será muito importante no sistema pois fará a busca nos dados do PDF e retornará eles, de forma bruta, em seus devidos objetos
 * </p>
 * 
 * 
 * @author Matheus Ferreira Santos
 * @category Class
 * @since 1.0
 * 
 */
public class AccountService {
	
	/**
	 * 
	 * <h1 align='center'>getAccountData</h1>
	 * <hr>
	 * <p>
	 * 	Método responsável por acessar o conteúdo do PDF, que é uma Lista de String, onde cada indice é uma linha do PDF informado,
	 * 	e retornar para outra classe um objeto do tipo Account, que conterá as seguintes informações:
	 * </p>
	 * 
	 * <em>
	 * 	<ul>
	 * 	 <li>Nome do titular - String</li>
	 * 	 <li>Agência do titular - String</li>
	 * 	 <li>Numero da conta do titular - String</li>
	 * 	</ul>
	 * </em>
	 * 
	 * 
	 * @author Matheus Ferreira Santos
	 * @category Method
	 * @param pdfContent
	 * @return Account
	 * @since 1.0
	 * 
	 */
	public Account getAccountData(List<String> pdfContent) {
		Account newAccount = new Account();
		Integer occurrenceIndex = 0;
		String content = "";
		
		List<String> options = Arrays.asList("Nome: ", "Agência: ", "Conta: ");
		
		
		for(String lineContent : pdfContent) {
			if(lineContent.toLowerCase().contains(options.get(0).toLowerCase()))
				newAccount.setName(lineContent.replaceAll(options.get(0), ""));
			
			if(lineContent.toLowerCase().contains(options.get(1).toLowerCase()))
				newAccount.setAgency(lineContent.replaceAll(options.get(1), "").substring(0, 4));
			
			if(lineContent.toLowerCase().contains(options.get(2).toLowerCase())) {
				occurrenceIndex = lineContent.indexOf(options.get(2));
				content = lineContent.replaceAll(options.get(2), "");
				newAccount.setAccountNumber((content.substring(occurrenceIndex, content.length()).replaceAll(" ", "")));
			}	
		}
		
		return newAccount;
	}
}
