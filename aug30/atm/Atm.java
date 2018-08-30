class Atm{
    public static void main(String[] args) {
        AtmMachine obj1=new AtmMachine(new SbiCard(102542,377,10000,"ONLINESBI"));
        obj1.getDetails();
        obj1.deposit(1000);
        System.out.println("the new balance "+obj1.getBalance());
        obj1.withdraw(2000);
        System.out.println("the new balance "+obj1.getBalance());

        AtmMachine obj2=new AtmMachine(new IciciCard(742456,755,15000,"HDFCCARD"));
        obj2.getDetails();
        obj2.deposit(1000);
        System.out.println("the new balance "+obj2.getBalance());
        obj2.withdraw(2000);
        System.out.println("the new balance "+obj2.getBalance());

    }
}