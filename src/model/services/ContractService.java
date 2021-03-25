package model.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import model.contracts.Contract;
import model.contracts.Installment;

public class ContractService {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	ArrayList<Installment> list = new ArrayList<Installment>();

	public ContractService() {
	}

	public void processContract(Contract contract, Integer months, OnlinePaymentService paymentService) {
		int c = 0;
		for (int i = contract.getNumberInstallment(); i > 0; i--) {
			double totalPayment = 0;
			double value = contract.getContractValue() / months;
			double tax = paymentService.paymentFee(value) + paymentService.interest(value, months - (i - 1));
			totalPayment = value + tax;

			Calendar cal = Calendar.getInstance();
			cal.setTime(contract.getDate());
			cal.add(Calendar.MONTH, c += 1);
			Date finalDate = cal.getTime();

			list.add(new Installment(totalPayment, finalDate));
		}

	}

	public ArrayList<Installment> getList() {
		return list;
	}

}
