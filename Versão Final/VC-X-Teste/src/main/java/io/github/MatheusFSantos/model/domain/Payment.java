package io.github.MatheusFSantos.model.domain;

import java.io.Serializable;

/**
 * 
 * <h1 align='center'>Payment</h1>
 * <hr>
 * <p>
 * 	Classe de Dominio do sistema que tem como foco abstrair os dados do pagamento da fatura, que está presente dentro do documento pdf,
 *  nesse caso, o pdf utilizado está no diretório "src/main/resources".
 *  Essa classe tem como atributos:
 * </p>
 * 
 * <em>
 * 	<ul>
 *   <li>BarCode - String</li>
 *   <li>Price - Double</li>
 *   <li>PayerInformations - String</li>
 * 	</ul>
 * </em>
 * 
 * @author Matheus Ferreira Santos
 * @category Class
 * @since 1.0
 * 
 */
public class Payment implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String barCode;
	private Double price;
	private String payerInformations;
	
	public Payment() {}
	
	/**
	 * 
	 * <h1 align='center'>Payment</h1>
	 * <hr>
	 * <p>
	 * 	Metodo construtor da classe que espera receber todos os campos do sistema, eles são:
	 * </p>
	 * 
	 * <em>
	 * 	<ul>
	 *   <li>BarCode - String</li>
	 *   <li>Price - Double</li>
	 *   <li>PayerInformations - String</li>
	 * 	</ul>
	 * </em>
	 * 
	 * @author Matheus Ferreira Santos
	 * @category Constructor
	 * @since 1.0
	 * 
	 */
	public Payment(String barCode, Double price, String payerInformations) {
		this.barCode = barCode;
		this.price = price;
		this.payerInformations = payerInformations;
	}
	
	@Override
	public String toString() {
		return "Payment [barCode=" + barCode + ", price=" + price + ", payerInformations=" + payerInformations + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((barCode == null) ? 0 : barCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (barCode == null) {
			if (other.barCode != null)
				return false;
		} else if (!barCode.equals(other.barCode))
			return false;
		return true;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPayerInformations() {
		return payerInformations;
	}

	public void setPayerInformations(String payerInformations) {
		this.payerInformations = payerInformations;
	}
	
}
