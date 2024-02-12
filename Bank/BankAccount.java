package br.edu.ifpr.stephanieho;

public class BankAccount {

	// Attributes
	private String accountNumber;
	private Double balance = 0.0;
	private BankAgency agency;

	// Methods - Get n Set
	// Account Number
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	
	// Balance
	public void setBalance(Double balanceValue) {
		this.balance = balanceValue;
	}

	public Double getBalance() {
		return this.balance;
	}

	
	// Bank Agency
	public void setAgency(BankAgency agency) {
		this.agency = agency;
	}

	public BankAgency getAgency() {
		return agency;
	}

	
	// Methods - Behavior
	public void withdraw(Double valor) {
		this.balance = this.balance - valor;
		// balance = balance + valor;
		// balance -= valor;
	}

	public void deposit(Double valor) {
		this.balance = this.balance + valor;
		// balance = balance + valor;
		// balance += valor;
	}

}
