class Policies{
    public static void main(String[] args) {
        HealthInsurance p1=new HealthInsurance(101,"health",200000,10000,10000,60000);
        HomeInsurance p2=new HomeInsurance(102, "Home", 300000, 50000, 20000, " ssi indore");
        LifeInsurance p3=new LifeInsurance(103, "Life",100000, 500000,"CASH", 3, "FATHER");
        VehicleInsurance p4 =new VehicleInsurance(105, "Policies",600000, 10151, 65484);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}