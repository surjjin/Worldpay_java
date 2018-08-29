class BankClient{
    public static void main(String args[]) {
        BankAccount c1 = new BankAccount();
        //setData() is static method
        BankAccount.setData(c1,1001,"abhinav",1000);
        System.out.println(BankAccount.countOfAccount);
        BankAccount c2 = new BankAccount(1002,"Aditya");
        System.out.println(BankAccount.countOfAccount);
        BankAccount c3 = new BankAccount(1003,"ashish",2000);
        System.out.println(BankAccount.countOfAccount);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        BankAccount.averageBalance();
        BankAccount.averageBalance(c1);
        BankAccount.averageBalance(c1,c2);
        BankAccount.averageBalance(c1,c2,c3);

        c1.deposit(150);
        c2.deposit(1000);
        c1.withdraw(150);
        c3.withdraw(150);
        c1.withdraw(15000);

        c1.isEquals(c2);
        c1.isEquals(c1);
    }
}