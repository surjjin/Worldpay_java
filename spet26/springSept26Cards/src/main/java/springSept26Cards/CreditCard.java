package springSept26Cards;

public abstract class CreditCard {
	private int cardno;
	private String expdate;
	private int limit;
	public int getCardno() {
		return cardno;
	}
	public void setCardno(int cardno) {
		this.cardno = cardno;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public CreditCard(int cardno, String expdate, int limit) {
		super();
		this.cardno = cardno;
		this.expdate = expdate;
		this.limit = limit;
	}
	public CreditCard() {
		super();
	}
	public String display() {
		return cardno+expdate+limit;
	}
	public abstract int rewardCalculate(int amount);
}
