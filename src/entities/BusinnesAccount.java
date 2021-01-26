package entities;

public class BusinnesAccount extends Account{

	private Double loanLimit;
	
	public BusinnesAccount() {
		super();
	}

	public BusinnesAccount(Integer number, String holder, Double balance, Double i) {
		super(number, holder, balance);
		this.loanLimit = i;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10;
		}	
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
