package springSept26Cards;

public class SilverCard extends CreditCard{
	static int RATE=2; 
	@Override
	public int rewardCalculate(int amount) {
		return (amount/1000)*RATE;
		
	}
	public int getRATE() {
		return RATE;
	}
	public SilverCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
