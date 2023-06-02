package io.github.MatheusFSantos.model.domain;

import java.io.Serializable;

public class PaymentVoucher implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String statementIdentification;
	
	private Account account;
	private Payment payment;
	
	private String date;
	
	public PaymentVoucher() {}
	
	public PaymentVoucher(String statementIdentification, Account account, Payment payment, String date) {
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
