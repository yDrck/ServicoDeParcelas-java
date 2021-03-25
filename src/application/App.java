package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.contracts.Contract;
import model.contracts.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class App {

	public static void main(String[] args) {

//		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter contract Data");
			System.out.println();

			System.out.print("Number: ");
			Integer number = sc.nextInt();

			System.out.print("Date (dd/MM/yyyy): ");
			Date date = sdf.parse(sc.next());

			System.out.print("Contract value: ");
			Double contractValue = sc.nextDouble();

			System.out.print("Enter number of installments: ");
			Integer nInsta = sc.nextInt();

			Contract contract = new Contract(number, date, contractValue, nInsta);
			ContractService contractService = new ContractService();

			contractService.processContract(contract, nInsta, new PaypalService());

			System.out.println("Installments: ");

			for (Installment x : contractService.getList()) {
				System.out.println(sdf.format(x.getDueDate()) + " - " + x.getAmount());
			}

		} catch (InputMismatchException e) {
			System.out.println("Error in this application -> " + e.getMessage());
		} catch (ParseException e) {
			System.out.println("Error in this application -> " + e.getMessage());
		}

	}

}
