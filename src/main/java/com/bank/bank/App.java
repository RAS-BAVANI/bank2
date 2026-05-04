package com.bank.bank;

public class App {
	int balance=0;
  public int deposit(int amt) {
	  if(amt <0) throw new IllegalArgumentException("amount not be zero");
	  balance+=amt;
	  return balance;
  }
  
  public int withdraw(int amt) {
	  if(amt > balance) {
		  throw new ArithmeticException("amt should not go beyond balance");
		  
	  }
	  balance-=amt;
	  return balance;
  }
  
  
  public int getBalance() {
	  return balance;
  }
}
