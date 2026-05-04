package com.bank.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    App app=new App();
  @Test
  public void checkDeposit() {
	  assertEquals(100,app.deposit(100));
  }
  @Test
  public void checkWithdraw() {
	  assertEquals(100,app.deposit(100));
	  assertEquals(50,app.withdraw(50));
  }
  @Test
  public void checkBalance() {
	  assertEquals(100,app.deposit(100));
	  assertEquals(50,app.withdraw(50));
	  assertEquals(50,app.getBalance());
  }
}
