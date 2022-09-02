package bankingapp;

public class BWNBA {
	private String full_name;//
	private double balance;//
	int accountNumber;
	int routingNumber;
	int monthlyMaintenance;
	int pinNumber;
	double amount;//
	double transfers;//
	double deposit;//
	double withdraw;//
	double withdrawlAmount;
	double depositAmount;//
	double ExcessiveTransactionsFee;

public BWNBA() {
}

public BWNBA(String full_name) {
this.full_name = full_name;	
}
public double getamount() {
	return amount;
}
public double gettransfers() {
	return transfers;
}	
public double getdeposit() {
	return deposit;
}
public double transfers(double balance, double amount, int routingNumber,double new_balance1, String name) {
	{  
	this.amount = amount;
    this.balance =balance;
    return new_balance1;  
}
}
public double Deposit(double balance, double despositAmount){
{
    this.amount += despositAmount;
    System.out.println("You have desposit" + despositAmount + "to your account." + "Balance is now: " +this.balance);
}
}
public double Withdraw(double balance, double withdrawlAmount) {
	{
    if(this.balance < withdrawlAmount) {
    	System.out.println("Insufficient Funds");
    } else {
    this.balance -= withdrawlAmount;
    System.out.println("You have withdrawl" + withdrawlAmount + "from your account" + "Balance is now:" + this.balance);	   
}

}
	
}

}


