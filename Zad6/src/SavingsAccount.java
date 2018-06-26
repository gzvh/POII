
public class SavingsAccount {

	static double annuallInterestRate = 3.5;
	private double savingsBalance;
	
	public SavingsAccount(double savings){
		this.depositSavings(savings);
	}
	
	public double balanceSavings(){
		return savingsBalance;
	}
	
	public void depositSavings(double deposit){
		this.savingsBalance = savingsBalance + deposit;
	}
	
	public void withdrawSavings(double withdraw){
		this.savingsBalance = savingsBalance - withdraw;
	}
	
	public void calculateMonthlyInterest(){
		double interest = (annuallInterestRate * this.savingsBalance / 12);
		System.out.println("Miesieczne odsetki: "+interest);
		System.out.println("Oprocentowanie roczne: "+annuallInterestRate+"%");
		this.savingsBalance = savingsBalance + interest;
	}
	
	static void modifyInterestRate(double newInterestRate){
		annuallInterestRate = newInterestRate;
	}
	
}
