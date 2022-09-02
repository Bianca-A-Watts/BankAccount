package bankingapp;

//Savings Account


public class BWNSA2 {
	
  private double balance;
  private double amount;
 
  public BWNSA2() {
  }

  public BWNSA2( double AccountNumber ) {
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
 


  /** Return diameter */
  public double getDeposit() {
	return balance + amount;
  }


  /* Print the bank account info */
  public void printBWNSA() {
	System.out.println("The Bank Account is created on and the balance is " + balance);
  }
  
}
