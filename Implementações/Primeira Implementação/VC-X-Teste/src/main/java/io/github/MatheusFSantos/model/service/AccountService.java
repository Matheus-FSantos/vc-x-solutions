package io.github.MatheusFSantos.model.service;

import java.util.Arrays;
import java.util.List;

import io.github.MatheusFSantos.model.domain.Account;

public class AccountService {
	
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
