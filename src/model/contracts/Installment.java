package model.contracts;

import java.util.Date;

public class Installment {

	private Double amount;
	private Date dueDate;

	public Installment() {

	}

	public Installment(Double amount, Date dueDate) {
		this.amount = amount;
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

}
