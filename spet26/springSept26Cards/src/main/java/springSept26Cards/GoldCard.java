package springSept26Cards;

public class GoldCard extends CreditCard{
	static int RATE=5; 
	@Override
	public int rewardCalculate(int amount) {
		return (amount/1000)*RATE;
		
	}
	public int getRATE() {
		return RATE;
	}
	public GoldCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
