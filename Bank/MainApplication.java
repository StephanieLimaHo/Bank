package br.edu.ifpr.stephanieho;

import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Instantiating and attributing values.
		BankAgency brazilAgency = new BankAgency();
		brazilAgency.setAgencyNumber("0028");
		
		BankAgency repArgAgency = new BankAgency();
		repArgAgency.setAgencyNumber("0011");
		
		BankAccount myAccount = new BankAccount();
		myAccount.setAccountNumber("004");
		myAccount.setAgency(brazilAgency);
		
		
		//Printing attributes' values
		System.out.println("Av Brasil: " + brazilAgency.getAgencyNumber());
		System.out.println("Av Rep. Argentina: " + repArgAgency.getAgencyNumber());
		
		System.out.println("\nNumero conta: " + myAccount.getAccountNumber());
		System.out.println("Numero agencia: " + myAccount.getAgency().getAgencyNumber());
		System.out.println("Saldo: " + myAccount.getBalance());
		
		
		//Method - DEPOSIT
		System.out.println("\nDEPOSITAR: R$ ");
		myAccount.deposit(scan.nextDouble());
		System.out.println("Saldo atual: " + myAccount.getBalance());
		
		
		//Method - WITHDRAW
		System.out.println("\nSACAR: R$ ");
		myAccount.withdraw(scan.nextDouble());
		System.out.println("Saldo atual: " + myAccount.getBalance());
		
		//Changing Agencies
		myAccount.setAgency(repArgAgency);

		System.out.println("\nAgência Av República Argentina");
		System.out.println("Numero da conta: " + myAccount.getAccountNumber());
		System.out.println("Numero agencia: " + myAccount.getAgency().getAgencyNumber());
		System.out.println("Saldo atual: " + myAccount.getBalance());
		
		scan.close();
	}

}
