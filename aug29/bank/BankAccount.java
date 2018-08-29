import javax.lang.model.util.ElementScanner6;

class BankAccount{
    private int accountNumber;
    private String name;
    private int balance;
    private static int totalBalance;
    public static int countOfAccount;
    BankAccount(){
        //default constructor 
        countOfAccount++;
    }
    BankAccount(int ano,String s){
        accountNumber=ano;
        name=s;
        countOfAccount++;
    }
    BankAccount(int ano,String s,int bal){
        this(ano,s);
        balance=bal;
        totalBalance=totalBalance+balance;
    }

    public static void averageBalance(){
        System.out.println("the average Balance is :"+totalBalance/countOfAccount);
    }
    public static void averageBalance(BankAccount...n){
        int temp=0;
        int count=0;
        for(BankAccount b:n){
            temp=temp+b.balance;
            count++;
        }
        System.out.println("the average Balance is :"+temp/count);
    }
    public static void setData(BankAccount obj,int ano,String s,int bal)
    {
        
        obj.accountNumber=ano;
        obj.name=s;
        obj.balance=bal;
        totalBalance=totalBalance+bal;

    }
    public void deposit(int amount){
        this.balance-=amount;
        System.out.println("the deposited amount is:"+amount+"\nthe net balance is: "+this.balance);
    }
    public void withdraw(int amount){
        if(this.balance>=amount)
        {
            this.balance+=amount;
            System.out.println("the deposited amount is:"+amount+"\nthe net balance is: "+this.balance);  
        }
        else
            System.out.println("insufficient fund");
    }
    public void isEquals(BankAccount obj){
        if (this.accountNumber==obj.accountNumber&&this.balance==obj.balance&&this.name.equals(obj.name))
        System.out.println("the object are equal");
        else
        System.out.println("the two objects are not equals"); 
    }
}

