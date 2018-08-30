class IciciCard implements AtmCard{
    private int cardNumber;
    private int cvv;
    private String cardHolderName;
    private int balance;

    IciciCard(int cardNumber,int cvv,int balance,String cardHolderName){
        setBalance(balance);
        setCardHolderName(cardHolderName);
        setCardNumber(cardNumber);
        setCvv(cvv);
    }


    public void setDetails(int cardNumber,int cvv,int balance,String cardHoString){
        setBalance(balance);
        setCardHolderName(cardHolderName);
        setCardNumber(cardNumber);
        setCvv(cvv);
    }
    
    public void getDetails(){
        System.out.println("Cardholder name "+this.getCardHolderName());
        System.out.println("Cardnumber "+this.getCardNumber());
        System.out.println("The balance "+this.getBalance());
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