package io.github.MatheusFSantos.model.domain;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String agency;
	private String accountNumber;

	public Account() {}
	
	public Account(String name, String agency, String accountNumber) {
		this.name = name;
		this.agency = agency;
		this.accountNumber = accountNumber;
	}
	
	@Override
	public String toString() {
		return "Conta [name = " + name + ", agency=" + agency + ", accountNumber=" + accountNumber + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
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
		Account other = (Account) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}
