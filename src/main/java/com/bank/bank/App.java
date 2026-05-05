package com.bank.bank;
import java.util.ArrayList;
public class App {
	int balance=0;
  public int deposit(int amt) {
	  ArrayList<String> history=new ArrayList<>();
	  if(amt <0) {
		 
		  throw new IllegalArgumentException("amount not be zero");
	  }
	  balance+=amt;
	  history.add("deposit:"+ amt + " Balance:"+balance);
	  return balance;
  }
  
  public int withdraw(int amt) {
	  if(amt > balance) {
		  history.add("Failed WithDraw:"+ amt + " Balance:"+balance);
		  throw new ArithmeticException("amt should not go beyond balance");
		  
	  }
	  history.add("WithDraw:"+ amt + " Balance:"+balance);
	  balance-=amt;
	  return balance;
  }
  
  
  public int getBalance() {
	  return balance;
  }

	public List<String> getHistory(){
		return history;
	}
}
