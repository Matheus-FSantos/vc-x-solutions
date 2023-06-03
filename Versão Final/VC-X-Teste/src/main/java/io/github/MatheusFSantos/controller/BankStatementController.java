package io.github.MatheusFSantos.controller;

import java.util.List;

import io.github.MatheusFSantos.model.service.BankStatementService;

public class BankStatementController {

	private BankStatementService bankStatementService;
	
	public BankStatementController() {
		this.bankStatementService = new BankStatementService();
	}
	
	public String getStatementIdentificationData(List<String> pdfContent) {
		return this.bankStatementService.getStatementIdentificationData(pdfContent);
	}
	
}
