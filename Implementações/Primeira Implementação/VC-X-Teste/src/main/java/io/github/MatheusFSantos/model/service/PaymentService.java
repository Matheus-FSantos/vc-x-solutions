package io.github.MatheusFSantos.model.service;

import java.util.Arrays;
import java.util.List;

import io.github.MatheusFSantos.model.domain.Payment;

public class PaymentService {
	
	public Payment getPaymentVoucherData(List<String> pdfContent) {
		Payment payment = new Payment();
		List<String> options = Arrays.asList("Código de barras: ", "Valor do documento: ", "pagador: ");
		
		String aux = "";
		Integer firstEmptySpacesIndex = 0;
		
		for(String lineContent : pdfContent) {
			if(lineContent.toLowerCase().contains(options.get(0).toLowerCase()))
				payment.setBarCode((lineContent.replaceAll(options.get(0), "")).replaceAll(" ", ""));
			
			if(lineContent.toLowerCase().contains(options.get(1).toLowerCase()))
				payment.setPrice(lineContent.replaceAll(options.get(1), ""));
			
			if(lineContent.toLowerCase().contains(options.get(2).toLowerCase())) {
				aux = lineContent.replaceAll(options.get(2), "");
				
				if(aux.contains("  "))
					firstEmptySpacesIndex = aux.indexOf("  ");
				
				if(firstEmptySpacesIndex != 0)
					payment.setPayerInformations(aux.substring(0, firstEmptySpacesIndex));
				else
					payment.setPayerInformations(aux);
			}
				
		}
		
		return payment;
	}
	
}
