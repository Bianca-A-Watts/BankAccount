package bankingapp;

public class BWNCA{


private double balance;
private double amount;
private int accountNumber;

  public BWNCA (int accountNumber) {
	  this.accountNumber = accountNumber;
  }
  public void setaccountNumber(int accountNumber) {
	  this.accountNumber = accountNumber;
  }
  

  /** Return balance */
  public double getBalance() {
	return balance;
  }

  /** Set a new balance */
  public void setBalance(double balance) {
	this.balance = balance;
  }
 
  /** Return amount*/
  public double getAmount()
  {
      return amount;
  }
 
  /** Set a new amount*/
  public void setAmount(double amount)
  {
      this.amount = amount;
  }
 
public int getaccountNumber() {
	return accountNumber;
}

  /** Return diameter */
  public double getDeposit() {
	return balance + amount;
  }
  
}