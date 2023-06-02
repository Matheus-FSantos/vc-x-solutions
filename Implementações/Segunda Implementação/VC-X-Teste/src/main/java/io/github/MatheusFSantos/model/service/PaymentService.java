package io.github.MatheusFSantos.model.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import io.github.MatheusFSantos.model.domain.Payment;
import io.github.MatheusFSantos.model.formatter.StringFormatter;

/**
 * 
 * <h1 align='center'>PaymentService</h1>
 * <hr>
 * <p>
 * 	Classe de serviço que fará algumas operações relacionadas ao pagamento da "fatura". Será muito importante no sistema pois fará
 *	a busca nos dados do PDF e retornará eles, de forma bruta, em seus devidos objetos
 * </p>
 * 
 * 
 * @author Matheus Ferreira Santos
 * @category Class
 * @since 1.0
 * 
 */
public class PaymentService {
	
	private StringFormatter stringFormatter;
	
	/**
	 * 
	 * <h1 align='center'>PaymentService</h1>
	 * <hr>
	 * <p>
	 * 	Método construtor da classe PaymentService, esse método é encarregado de criar uma instancia da classe Formatter, 
	 * 	que está contida no pacote "io.github.MatheusFSantos.model.formatter"
	 * </p>
	 * 
	 * 
	 * @author Matheus Ferreira Santos
	 * @category Constructor
	 * @since 1.0
	 * 
	 */
	public PaymentService() {
		this.stringFormatter = new StringFormatter();
	}
	
	
	/**
	 * 
	 * <h1 align='center'>getPaymentVoucherData</h1>
	 * <hr>
	 * <p>
	 * 	Método responsável por acessar o conteúdo do PDF, que é uma Lista de String, onde cada indice é uma linha do PDF informado,
	 * 	e retornar para outra classe um objeto do tipo Payment, que conterá as seguintes informações:
	 * </p>
	 * 
	 * <em>
	 * 	<ul>
	 * 	 <li>Codigo de barras - String</li>
	 * 	 <li>Valor do documento - Double</li>
	 * 	 <li>Informações do pagador - String</li>
	 * 	</ul>
	 * </em>
	 * 
	 * 
	 * @author Matheus Ferreira Santos
	 * @category Method
	 * @param pdfContent
	 * @return Payment
	 * @since 1.0
	 * 
	 */
	public Payment getPaymentVoucherData(List<String> pdfContent) {
		Payment payment = new Payment();
		List<String> options = Arrays.asList("Código de barras: ", "Valor do documento: ", "pagador: ");
		
		String aux = "";
		Integer firstEmptySpacesIndex = 0;
		
		for(String lineContent : pdfContent) {
			if(lineContent.toLowerCase().contains(options.get(0).toLowerCase()))
				payment.setBarCode((lineContent.replaceAll(options.get(0), "")).replaceAll(" ", ""));
			
			if(lineContent.toLowerCase().contains(options.get(1).toLowerCase())) {
				aux = lineContent.replaceAll(options.get(1), "");
				aux = aux.substring(3, aux.length());
				aux = aux.replaceAll(",", ".");
				
				
				payment.setPrice(Double.parseDouble(aux));
			}
			
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
	
	/**
	 * 
	 * <h1 align='center'>getPaymentDate</h1>
	 * <hr>
	 * <p>
	 * 	Método responsável por acessar o conteúdo do PDF, que é uma Lista de String, onde cada indice é uma linha do PDF informado,
	 * 	e retornar para outra classe todas as informações sobre a data que a transação foi realizada
	 * </p>
	 * <p align='center'>
	 * 	<em>Obs.: Acessa na classe Formatter o metodo getDateFormatted e passa uma String, referente a data informada no PDF</em>
	 * </p>
	 * 
	 * 
	 * @author Matheus Ferreira Santos
	 * @category Method
	 * @param pdfContent
	 * @return Payment
	 * @since 1.0
	 * 
	 */
	public Date getPaymentDate(List<String> pdfContent) {
		String option = "Operação efetuada em ";
		
		Integer firstEmptySpacesIndex = 0;
		Integer secoundEmptySpacesIndex = 0;
		
		String date = "";
		String hours = "";
		
		String content = "";
		
		for(String lineContent : pdfContent) {
			if(lineContent.toLowerCase().contains(option.toLowerCase())) {
				content = lineContent.replaceAll(option, "");
				option = "às";
				
				if(content.contains(option))
					content = content.replaceAll(option, "");
				
				if(content.contains("   "))
					firstEmptySpacesIndex = content.indexOf("  ");
				
				if(firstEmptySpacesIndex != 0) {
					date = content.substring(0, firstEmptySpacesIndex);
					content = content.substring(firstEmptySpacesIndex + 3, content.length()); //remove os espaços em branco
				}
				
				if(content.contains(" "))
					secoundEmptySpacesIndex = content.indexOf(" ");
				
				if(secoundEmptySpacesIndex != 0)
					hours = content.substring(0, secoundEmptySpacesIndex);
				
				return this.stringFormatter.getDateFormatted(date + " " + hours);
			}
		}
		
		return this.stringFormatter.getDateFormatted(date + " " + hours);
	}
	
}
