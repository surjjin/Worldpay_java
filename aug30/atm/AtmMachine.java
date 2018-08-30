class AtmMachine{
    AtmCard obj ;
    AtmMachine(AtmCard obj){
        this.obj=obj;
    }
    void deposit(int amount){
        obj.deposit(amount);
    }
    void withdraw(int amount){
        obj.withdraw(amount);
    }
    int getBalance(){
        return obj.getBalance();
    }
    void getDetails(){
        obj.getDetails();
    }
}