public class SavingsAccount extends BankAccount {
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name,amount);
		accountNumber = super.getAccountNumber() + "-"+ savingsNumber;
		
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(((BankAccount)oldAccount),amount);
		savingsNumber = oldAccount.savingsNumber + 1;
		String newString = ((BankAccount)oldAccount).getAccountNumber();
		accountNumber = newString.substring(0,newString.length() - 2) + "-"+ savingsNumber;
		
	}
	
	public void postInterest() {
		super.deposit(super.getBalance()*(rate/12));
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
}