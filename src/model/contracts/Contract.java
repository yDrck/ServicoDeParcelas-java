package model.contracts;

import java.util.Date;

public class Contract {

	private Integer number;
	private Date date;
	private Double contractValue;
	private Integer numberInstallment;
	private Installment installment;

	public Contract() {

	}

	public Contract(Integer number, Date date, Double contractValue, Integer numberInstallment) {
		this.number = number;
		this.date = date;
		this.contractValue = contractValue;
		this.numberInstallment = numberInstallment;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getContractValue() {
		return contractValue;
	}

	public void setContractValue(Double contractValue) {
		this.contractValue = contractValue;
	}

	public Integer getNumberInstallment() {
		return numberInstallment;
	}

	public void setNumberInstallment(Integer numberInstallment) {
		this.numberInstallment = numberInstallment;
	}

	public Installment getInstallment() {
		return installment;
	}

	public void setInstallment(Installment installment) {
		this.installment = installment;
	}

}
