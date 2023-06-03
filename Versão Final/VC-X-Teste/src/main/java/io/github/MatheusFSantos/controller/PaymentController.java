package io.github.MatheusFSantos.controller;

import java.util.Date;
import java.util.List;

import io.github.MatheusFSantos.model.domain.Payment;
import io.github.MatheusFSantos.model.service.PaymentService;

public class PaymentController {

	private PaymentService paymentService;
	
	public PaymentController() {
		this.paymentService = new PaymentService();
	}
	
	public Payment getPaymentData(List<String> pdfContent) {
		return this.paymentService.getPaymentData(pdfContent);
	}
	
	public Date getPaymentDate(List<String> pdfContent) {
		return this.paymentService.getPaymentDate(pdfContent);
	}
	
}
