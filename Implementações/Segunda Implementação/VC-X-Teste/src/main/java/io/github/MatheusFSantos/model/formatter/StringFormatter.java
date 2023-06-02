package io.github.MatheusFSantos.model.formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * <h1 align='center'>StringFormatter</h1>
 * <hr>
 * <p>
 * 	Classe formatadora do sistema que, como o nome já diz, tem como principal funcionalidade formatar alguma cadeia de caracteres
 * </p>
 * 
 * 
 * @author Matheus Ferreira Santos
 * @category Class
 * @since 1.0
 * 
 */
public class StringFormatter {

	/**
	 * 
	 * <h1 align='center'>getDateFormatted</h1>
	 * <hr>
	 * <p>
	 * 	Método da classe Formatter que recebe uma String, contendo uma data/hora, e formata ela para a classe Date do pacote java.util
	 * </p>
	 * <p align='center'>
	 * 	<em>>> Obs.: A String enviada deve estar no formato "dd/MM/yyyy HH:mm:ss" para ser formatada</em>
	 * </p>
	 * 
	 * 
	 * @author Matheus Ferreira Santos
	 * @category Method
	 * @param date
	 * @return Date
	 * @since 1.0
	 * 
	 */
	public Date getDateFormatted(String date) {
		try {
			return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(date);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
}
