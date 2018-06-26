
public class Main {

	public static void main(String[] args) {
	
		SavingsAccount konto = new SavingsAccount(5000);
		System.out.println("Na koncie jest: "+konto.balanceSavings()+"zl");

		konto.depositSavings(1000);
		System.out.println("Na konto dodano 1000zl : "+konto.balanceSavings()+"zl");
		
		konto.withdrawSavings(999);
		System.out.println("Z konta wyplacono 999zl : "+konto.balanceSavings()+"zl");
		
		konto.calculateMonthlyInterest();
		System.out.println("Konto po miesiacu: "+konto.balanceSavings()+"zl");
		
		SavingsAccount.modifyInterestRate(4.5);
		System.out.println("Nowe oprocentowanie wynosi: 4.5%");
		
		konto.calculateMonthlyInterest();
		System.out.println("Po zmianie oprocenotowania: "+konto.balanceSavings()+"zl");
		
	}

}
