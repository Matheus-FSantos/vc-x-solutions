package io.github.MatheusFSantos.controller;

import java.util.List;

import io.github.MatheusFSantos.model.domain.Account;
import io.github.MatheusFSantos.model.service.AccountService;

public class AccountController {
	
	private AccountService accountService;
		
	public AccountController() {
		this.accountService = new AccountService();
	}

	public Account getAccountData(List<String> pdfContent) {
		return accountService.getAccountData(pdfContent);
	}
}
