package model.entities;

import model.exception.DomainException;

public class Account {
	private Integer number;
	private String holder;
	public Double balance;
	public Double withdraw;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdraw) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdraw = withdraw;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(Double withdraw) {
		this.withdraw = withdraw;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(Double amount) throws DomainException {
		if (amount > getBalance()) {
			throw new DomainException("Not enough balance");
		} 
		
		if (amount > getWithdraw()) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		
		this.balance -= amount;
	}
	
	@Override
	public String toString() {
		return "New balance: " + String.format("%.2f", getBalance());
	}

}
