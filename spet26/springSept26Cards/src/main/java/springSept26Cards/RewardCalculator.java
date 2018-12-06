package springSept26Cards;

public class RewardCalculator {
	CreditCard cc;
	public int rewardCalculation(int amount) {
		return cc.rewardCalculate(amount);
	}
	public String display() {
		return cc.display();
	}
	public RewardCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RewardCalculator(CreditCard cc) {
		super();
		this.cc = cc;
	}
	public CreditCard getCc() {
		return cc;
	}
	public void setCc(CreditCard cc) {
		this.cc = cc;
	}
	
}
