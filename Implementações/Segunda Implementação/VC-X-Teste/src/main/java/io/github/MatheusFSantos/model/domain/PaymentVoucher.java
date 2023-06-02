package io.github.MatheusFSantos.model.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * <h1 align='center'>PaymentVoucher</h1>
 * <hr>
 * <p>
 * 	Classe de Dominio do sistema que tem como foco abstrair os dados do extrato, nesse caso, o pdf, que contém esses dados, está no diretório "src/main/resources".
 *  Essa classe tem como atributos:
 * </p>
 * 
 * <em>
 * 	<ul>
 *   <li>StatementIdentification - String</li>
 *   <li>Account - Account</li>
 *   <li>Payment - Payment</li>
 *   <li>Date - Date</li>
 * 	</ul>
 * </em>
 * 
 * @author Matheus Ferreira Santos
 * @category Class
 * @since 1.0
 * 
 */
public class PaymentVoucher implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String statementIdentification;
	
	private Account account;
	private Payment payment;
	
	private Date date;
	
	public PaymentVoucher() {}
	
	/**
	 * 
	 * <h1 align='center'>PaymentVoucher</h1>
	 * <hr>
	 * <p>
	 * 	Metodo construtor da classe que espera receber todos os campos do sistema, eles são:
	 * </p>
	 * 
	 * <em>
	 * 	<ul>
	 *   <li>StatementIdentification - String</li>
	 *   <li>Account - Account</li>
	 *   <li>Payment - Payment</li>
	 *   <li>Date - Date</li>
	 * 	</ul>
	 * </em>
	 * 
	 * @author Matheus Ferreira Santos
	 * @category Constructor
	 * @since 1.0
	 * 
	 */
	public PaymentVoucher(String statementIdentification, Account account, Payment payment, Date date) {
		super();
		this.statementIdentification = statementIdentification;
		this.account = account;
		this.payment = payment;
		this.date = date;
	}

	@Override
	public String toString() {
		return "PaymentVoucher [statementIdentification=" + statementIdentification + ", account=" + account + ", payment=" + payment + ", date="
				+ date + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((statementIdentification == null) ? 0 : statementIdentification.hashCode());
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
		PaymentVoucher other = (PaymentVoucher) obj;
		if (statementIdentification == null) {
			if (other.statementIdentification != null)
				return false;
		} else if (!statementIdentification.equals(other.statementIdentification))
			return false;
		return true;
	}

	public String getStatementIdentification() {
		return statementIdentification;
	}

	public void setStatementIdentification(String identifier) {
		this.statementIdentification = identifier;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
