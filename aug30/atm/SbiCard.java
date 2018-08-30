class SbiCard implements AtmCard{
    private int cardNumber;
    private int cvv;
    private String cardHolderName;
    private int balance;

    SbiCard(int cardNumber,int cvv,int balance,String cardHoString){
        setBalance(balance);
        setCardHolderName(cardHolderName);
        setCardNumber(cardNumber);
        setCvv(cvv);
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getBalance() {
        return balance;
    }
    public String getCardHolderName() {
        return cardHolderName;
    }
    public int getCardNumber() {
        return cardNumber;
    }
    public int getCvv() {
        return cvv;
    }

    public void deposit (int amount){
        this.balance+=amount;
    }

     public void withdraw(int amount){
        this.balance-=amount;
    }
}