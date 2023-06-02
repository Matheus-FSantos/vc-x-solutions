package io.github.MatheusFSantos.model.domain;

import java.io.Serializable;

public class Payment implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String barCode;
	private String price;
	private String payerInformations;
	
	public Payment() {}
	
	public Payment(String barCode, String price, String payerInformations) {
		super();
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPayerInformations() {
		return payerInformations;
	}

	public void setPayerInformations(String payerInformations) {
		this.payerInformations = payerInformations;
	}
	
}
