
public class CheckingAccount extends BankAccount{
	private static double FEE = .15;
	
	public CheckingAccount(String name, double Amount) {
		super(name,Amount);
		super.setAccountNumber(super.getAccountNumber()+"-10");
	}
	
	public boolean withdraw(double amount) {
		
		amount += FEE;
		return super.withdraw(amount);
		
	}
	
}
