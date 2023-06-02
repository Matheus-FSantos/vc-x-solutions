package io.github.MatheusFSantos.model;

import java.util.Date;
import java.util.List;

import io.github.MatheusFSantos.model.domain.Account;
import io.github.MatheusFSantos.model.domain.Payment;
import io.github.MatheusFSantos.model.domain.PaymentVoucher;
import io.github.MatheusFSantos.model.manager.DocumentManager;
import io.github.MatheusFSantos.model.service.AccountService;
import io.github.MatheusFSantos.model.service.BankStatementService;
import io.github.MatheusFSantos.model.service.PaymentService;

public class VCXApp {
	
	
	public static void main(String[] args) {
		
		DocumentManager documentManager = new DocumentManager("/home/matheus/Eclipse/VC-X-Teste/src/main/resources/documento.pdf");
		List<String> pdfContent = documentManager.getDocument().getPdfContent();

		String statementIdentification = new BankStatementService().getStatementIdentificationData(pdfContent);
		Account account = new AccountService().getAccountData(pdfContent);
		Payment payment = new PaymentService().getPaymentVoucherData(pdfContent);
		Date date = new PaymentService().getPaymentDate(pdfContent);
		
		PaymentVoucher paymentVoucher = new PaymentVoucher(statementIdentification, account, payment, date);
		System.out.println(paymentVoucher);
		
	}
	
}
