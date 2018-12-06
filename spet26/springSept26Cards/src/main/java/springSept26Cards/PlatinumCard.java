package springSept26Cards;

public class PlatinumCard extends CreditCard{

	final int RATE=10; 
	@Override
	public int rewardCalculate(int amount) {
		return (amount/1000)*RATE;
		
	}
	public int getRATE() {
		return RATE;
	}
	public PlatinumCard() {
		
	}

}
